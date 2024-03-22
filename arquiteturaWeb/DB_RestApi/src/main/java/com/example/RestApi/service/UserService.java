package com.example.RestApi.service;
import com.example.RestApi.model.UserEntity;
import com.example.RestApi.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> obterTodos(){return userRepository.findAll();}
    public UserEntity obterPorId(String id){return userRepository.findById(id).orElse(null);}
    public UserEntity inserir(UserEntity user){return userRepository.save(user);}
    public UserEntity atualizar(String id, UserEntity newUser){
        UserEntity existingUser = userRepository.findById(id).orElse(null);
        if(existingUser != null){
            existingUser.setName(newUser.getName());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        } else{
            return null;
        }

    }
    public void excluir(String id){userRepository.deleteById(id);}
    public List<UserEntity> buscarPorNome(String name) {
        return userRepository.findByNome(name);
    }
    public List<UserEntity> buscarPorEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<UserEntity> buscarPorNomeEEmail(String name, String email) {
        return userRepository.findByNomeAndEmail(name, email);
    }

    public List<UserEntity> buscarPorNomeQueComecaCom(String prefixo) {
        return userRepository.findByNomeStartingWithIgnoreCase(prefixo);
    }

    public List<UserEntity> buscarPorNomeQueContem(String substring) {
        return userRepository.findByNomeContainingIgnoreCase(substring);
    }

}
