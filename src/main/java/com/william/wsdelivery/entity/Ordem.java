package com.william.wsdelivery.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "TB_ORDEM")
public class Ordem implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endereco;
    private Double latitude;
    private Double longitude;
    private Instant momento;
    private OrdemStatus status;
private Double total;

    @ManyToMany
    @JoinTable(name = " TB_ORDEM_PEDIDO",
            joinColumns = @JoinColumn(name = "ORDEM_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUTO_ID"))
    private Set<Produto> produtos = new HashSet<>();

    public Ordem() {

    }

    public Ordem(String endereco, Double latitude, Double longitude, Instant momento, OrdemStatus status) {

        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.momento = momento;
        this.status = status;
        this.total=total;
    }


    public Long getId() {
        return id;
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


    public Double getTotal(){
double soma = 0.0;
for (Produto p: produtos){

    soma+= p.getPreco();

}
return         soma;


    }
    public Set<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ordem)) return false;
        Ordem ordem = (Ordem) o;
        return id.equals(ordem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
