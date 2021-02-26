package com.william.wsdelivery.servicos;


import com.william.wsdelivery.dto.ProdutoDTO;
import com.william.wsdelivery.entity.Produto;
import com.william.wsdelivery.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    private ProdutoRepositorio produtoRepositorio;

    public ProdutoService(ProdutoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    @Transactional(readOnly = true) //garantir que fecha a conexao
    public List<ProdutoDTO> acheTodos() {
        List<Produto> lista = produtoRepositorio.findAllByOrderByNomeAsc();
        return lista.stream().map(produto -> new ProdutoDTO(produto)).collect(Collectors.toList());

    }
}
