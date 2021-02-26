package com.william.wsdelivery.servicos;


import com.william.wsdelivery.dto.OrdemDTO;
import com.william.wsdelivery.dto.ProdutoDTO;
import com.william.wsdelivery.entity.Ordem;
import com.william.wsdelivery.entity.OrdemStatus;
import com.william.wsdelivery.entity.Produto;
import com.william.wsdelivery.repositorio.OrdemRepositorio;
import com.william.wsdelivery.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdemService {
    private OrdemRepositorio ordemRepositorio;
    private ProdutoRepositorio produtoRepositorio;

    public OrdemService(OrdemRepositorio ordemRepositorio, ProdutoRepositorio produtoRepositorio) {

        this.produtoRepositorio = produtoRepositorio;
        this.ordemRepositorio = ordemRepositorio;
    }

    @Transactional(readOnly = true) //garantir que fecha a conexao
    public List<OrdemDTO> acheTodos() {
        List<Ordem> lista = ordemRepositorio.findOrdemWithProdutos();
        return lista.stream().map(OrdemDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public OrdemDTO inserir(OrdemDTO dto) {
        Ordem ordem = new Ordem(dto.getEndereco()
                , dto.getLatitude()
                , dto.getLongitude()
                , Instant.now()
                , OrdemStatus.PENDENTE);
//percorrer todos os Produtos dto, dentro do dto.getProduto
        //preciso associar os produitos com o pedido
        // preciso instancia uma entidade para cada produto dto

        for (ProdutoDTO p : dto.getProdutos()) {
            Produto produto = produtoRepositorio.getOne(p.getId());
            ordem.getProdutos().add(produto);
        }
        ordem = ordemRepositorio.save(ordem);
        return new OrdemDTO(ordem);
    }
}
