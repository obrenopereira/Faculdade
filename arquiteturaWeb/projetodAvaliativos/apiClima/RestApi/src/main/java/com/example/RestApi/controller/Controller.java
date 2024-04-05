    package com.example.RestApi.controller;

    import com.example.RestApi.model.ClimaEntity;
    import com.example.RestApi.service.ClimaService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/clima")
    public class Controller {

        @Autowired
        private ClimaService service;
        @GetMapping("/clima")
        public String preverTempo(){
            return service.preverTempo();
        }
        @GetMapping("/{id}")
        public ClimaEntity obterPorId(@PathVariable String id) {
            return service.obterPorId(id);
        }

        @DeleteMapping("/{id}")
        public void excluir(@PathVariable String id) {
            service.excluir(id);
        }

        @PutMapping("/{id}")
        public ClimaEntity atualizar(@PathVariable String id, @RequestBody ClimaEntity novoCLima) {
            return service.atualizar(id, novoCLima);
        }


    }
