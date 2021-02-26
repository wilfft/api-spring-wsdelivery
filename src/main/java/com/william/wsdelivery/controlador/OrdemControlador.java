package com.william.wsdelivery.controlador;

import com.william.wsdelivery.dto.OrdemDTO;
import com.william.wsdelivery.servicos.OrdemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<OrdemDTO> novaOrdem(@RequestBody OrdemDTO dto) {
        dto = ordemService.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id]")
                //chamada parar criar um uri que corresponde ao recurso que criei
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
