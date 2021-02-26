package com.william.wsdelivery.repositorio;

import com.william.wsdelivery.entity.Ordem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepositorio extends JpaRepository<Ordem, Long> {

}
