package com.william.wsdelivery.controlador;

import com.william.wsdelivery.dto.OrdemDTO;
import com.william.wsdelivery.servicos.OrdemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ordens")

public class OrdemControlador {

    private OrdemService ordemService;

    public OrdemControlador(OrdemService ordemService) {
        this.ordemService = ordemService;
    }

    @GetMapping
    public ResponseEntity<List<OrdemDTO>> acheTodos() {
        List<OrdemDTO> lista = ordemService.acheTodos();
        return ResponseEntity.ok().body(lista);
    }


}
