package com.william.wsdelivery.controlador;

import com.william.wsdelivery.dto.OrdemDTO;
import com.william.wsdelivery.servicos.OrdemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
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
        System.out.println("ERRO");
        List<OrdemDTO> lista = ordemService.acheTodos();
        return ResponseEntity.ok().body(lista);
    }
    @GetMapping("/teste")
    public String  teste() {

        return "testando rota teste";
    }

    @PostMapping
    public ResponseEntity<OrdemDTO> novaOrdem(@RequestBody OrdemDTO dto) {
        dto = ordemService.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id]")
                //chamada parar criar um uri que corresponde ao recurso que criei
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping("/{id}/entregue")
    public ResponseEntity<OrdemDTO> foiEntregue(@PathVariable Long id) {
        OrdemDTO dto = ordemService.foiEntregue(id);
        return ResponseEntity.ok().body(dto);
    }
}

