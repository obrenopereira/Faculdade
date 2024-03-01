package com.example.apiTabelaFip.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    private String consultarUrl(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        } else{
            dados = "Falaha ao encontrar dados. Códgio de status" + responseEntity.getStatusCode();
        }
        return dados;

    }
    public String consultarMarcas(){
        return consultarUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }
    public String consultarModelos(int id){
        return consultarUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+id+"/modelos");
    }

    public String consultarAnos(int marca, int modelo){
        return consultarUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos"+modelo+"anos");
    }


}
