package com.william.wsdelivery.repositorio;

import com.william.wsdelivery.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
    List<Produto> findAllByOrderByNomeAsc();


}
