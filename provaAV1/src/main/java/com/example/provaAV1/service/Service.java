package com.example.provaAV1.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    private String consultarUrl(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        } else{
            dados = "Ocorreu um erro ao obter os dados. Código de status" + responseEntity.getStatusCode();
        }
        return  dados;

    }
    public String consultarNoticiasReleases(){
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias");
    }
    public String consultarNoticias(){
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }

    public String consultarReleases(){
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }


}
