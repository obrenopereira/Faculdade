package com.example.RestApi.service;
import com.example.RestApi.model.ClimaEntity;
import com.example.RestApi.repository.ClimaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    @Autowired
    private ClimaRepository climaRepository;
    public ClimaEntity obterPorId(String id){return climaRepository.findById(id).orElse(null);}
    public ClimaEntity inserir(ClimaEntity user){return climaRepository.save(user);}
    public void excluir(String id){climaRepository.deleteById(id);}

    public String preverTempo(){
        String dadosMeteorologicos = "";
        //Nível BR
        String apiUrl = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=9fe25332679ebce952fdd9f7f9a83c3e";
        //Nível BH
        //String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/6879/current?token=9fe25332679ebce952fdd9f7f9a83c3e";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosMeteorologicos = responseEntity.getBody();
        } else {
            dadosMeteorologicos = "Falha ao obter dados meteorológicos. Código de status: " + responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }

    public ClimaEntity atualizar(String id, ClimaEntity novoClima) {
        ClimaEntity existingClima = climaRepository.findById(id).orElse(null);

        if (existingClima != null) {
            existingClima.setPais(novoClima.getPais());
            existingClima.setData(novoClima.getData());
            return climaRepository.save(existingClima);
        } else {
            return null;
        }
    }

}
