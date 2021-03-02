package com.william.wsdelivery.dto;

import com.william.wsdelivery.entity.Ordem;
import com.william.wsdelivery.entity.OrdemStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdemDTO implements Serializable {


    private static final long serialVersionUID = 1l;
    private Long id;
    private String endereco;
    private Double latitude;
    private Double longitude;
    private Instant momento;
    private OrdemStatus status;
private Double total;
    private List<ProdutoDTO> produtos = new ArrayList<>();

    public OrdemDTO() {
    }

    public OrdemDTO(Long id, String endereco, Double latitude, Double longitude, Instant momento, OrdemStatus status, Double total) {
        this.id = id;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.momento = momento;
        this.status = status;
        this.total=total;
    }

    public OrdemDTO(Ordem entidade) {
        id = entidade.getId();
        endereco = entidade.getEndereco();
        latitude = entidade.getLatitude();
        longitude = entidade.getLatitude();
        momento = entidade.getMomento();
        status = entidade.getStatus();
        total= entidade.getTotal();
        produtos = entidade.getProdutos()
                .stream()
                .map(produto -> new ProdutoDTO(produto))
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }
}
