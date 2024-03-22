package com.example.RestApi.repository;

import com.example.RestApi.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    List<UserEntity> findByNome(String nome);
    List<UserEntity> findByEmail(String email);

    // Consulta personalizada para encontrar usuários pelo nome e email
    @Query("{ 'name' : ?0, 'email' : ?1 }")
    List<UserEntity> findByNomeAndEmail(String name, String email);

    // Consulta personalizada para encontrar usuários pelo nome que começa com um determinado prefixo
    @Query("{ 'name' : { $regex : ?0, $options: 'i' } }")
    List<UserEntity> findByNomeStartingWithIgnoreCase(String prefix);

    // Consulta personalizada para encontrar usuários pelo nome que contenham uma determinada string
    @Query("{ 'name' : { $regex : ?0, $options: 'i' } }")
    List<UserEntity> findByNomeContainingIgnoreCase(String substring);


}
