package com.william.wsdelivery.repositorio;

import com.william.wsdelivery.entity.Ordem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdemRepositorio extends JpaRepository<Ordem, Long> {

    @Query("SELECT DISTINCT obj FROM Ordem obj JOIN FETCH obj.produtos"
            + " WHERE obj.status=0 ORDER BY obj.momento ASC")
        //produtos vem da coleçao criada na entidade ordem
    List<Ordem> findOrdemWithProdutos();
}
