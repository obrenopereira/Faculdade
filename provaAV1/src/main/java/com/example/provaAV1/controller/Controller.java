package com.example.provaAV1.controller;


import com.example.provaAV1.Model.NoticeEntity;
import com.example.provaAV1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
@RequestMapping("/notices")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping
    public List<NoticeEntity> obterNoticias(){
        return service.consultarNoticias();
    }



    //https://servicodados.ibge.gov.br/api/v3/noticias
    @GetMapping("/noticias")
    public List consultarNoticias(){
        return service.consultarNoticias();
    }

    @GetMapping
    public List<UserEntity> obterTodos() {
        return userService.obterTodos();
    }
    @GetMapping("/noticias/{noticia}")
    public String consultarNoticiaRelease(){
        return service.consultarNoticias();
    }

    @GetMapping("/releases/{noticia}")
    public String consultarReleases(){
        return service.consultarReleases();
    }

}