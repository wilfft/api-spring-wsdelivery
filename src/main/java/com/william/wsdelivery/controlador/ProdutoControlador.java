package com.william.wsdelivery.controlador;

import com.william.wsdelivery.dto.ProdutoDTO;
import com.william.wsdelivery.servicos.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoControlador {

    private ProdutoService produtoService;

    public ProdutoControlador(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> acheTodos() {
        List<ProdutoDTO> lista = produtoService.acheTodos();
        return ResponseEntity.ok().body(lista);
    }



}
