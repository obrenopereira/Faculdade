package com.example.RestApi.controller;

import com.example.RestApi.model.UserEntity;
import com.example.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> obterTodos(){
        return userService.obterTodos();
    }
    @GetMapping("/{id}")
    public UserEntity obterPorid(@PathVariable String id){return userService.obterPorId(id);}

    @PostMapping
    public UserEntity inserir(@RequestBody UserEntity user){return userService.inserir(user);}

    @PutMapping
    public UserEntity atualizar(@PathVariable String id, @RequestBody UserEntity user){
        return userService.atualizar(id, user);
    }

    @DeleteMapping
    public void excluir(@PathVariable String id){userService.excluir(id);}

    @GetMapping("/buscarPorNome/{name}")
    public List<UserEntity> buscarUsuariosPorNome(@PathVariable String name) {
        return userService.buscarPorNome(name);
    }
    @GetMapping("/buscarPorEmail/{email}")
    public List<UserEntity> buscarUsuarioPorEmail(@PathVariable String email){
        return  userService.buscarPorEmail(email);
    }

    @GetMapping("/buscarPorNomeEEmail")
    public List<UserEntity> buscarUsuariosPorNomeEEmail(@RequestParam("nome") String nome, @RequestParam("email") String email) {
        return userService.buscarPorNomeEEmail(nome, email);
    }

    @GetMapping("/buscarPorNomeQueComecaCom/{prefixo}")
    public List<UserEntity> buscarUsuariosPorNomeQueComecaCom(@PathVariable String prefixo) {
        return userService.buscarPorNomeQueComecaCom(prefixo);
    }
    @GetMapping("/buscarPorNomeQueContem/{contem}")
    public List<UserEntity> buscarUsuariosPorNomeQueContem(@PathVariable String contem) {
        return userService.buscarPorNomeQueContem(contem);
    }

}
