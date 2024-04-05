package com.example.RestApi.repository;

import com.example.RestApi.model.ClimaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClimaRepository extends MongoRepository<ClimaEntity, String> {

}
