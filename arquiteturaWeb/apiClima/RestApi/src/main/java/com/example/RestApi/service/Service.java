package com.example.RestApi.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo(){
        String dadosMetereologicos = "";
        String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=a271d88e8c65675eb441fbd0d6ebb9cf   s";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosMetereologicos = responseEntity.getBody();
        } else{
            dadosMetereologicos = "Falha ao obter dados meteorologicos. Código de status: " + responseEntity.getStatusCode();

        }
        return dadosMetereologicos;

    }
}
