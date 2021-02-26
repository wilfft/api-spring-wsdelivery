package com.william.wsdelivery.servicos;


import com.william.wsdelivery.dto.OrdemDTO;
import com.william.wsdelivery.entity.Ordem;
import com.william.wsdelivery.repositorio.OrdemRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdemService {
    private OrdemRepositorio ordemRepositorio;

    public OrdemService(OrdemRepositorio ordemRepositorio) {

        this.ordemRepositorio = ordemRepositorio;
    }

    @Transactional(readOnly = true) //garantir que fecha a conexao
    public List<OrdemDTO> acheTodos() {
        List<Ordem> lista = ordemRepositorio.findAll();
        return lista.stream().map(ordem -> new OrdemDTO(ordem)).collect(Collectors.toList());

    }
}
