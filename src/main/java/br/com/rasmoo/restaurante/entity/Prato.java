package br.com.rasmoo.restaurante.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pratos")
public class Prato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTY)
    private Integer id;


    private String nome;
    private String descricao;
    private Boolean disponivel;
    private Double valor;
    @Column(name = "data_de_registro")
    private  LocalDateTime dataDeRegistro;


    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public java.lang.Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(java.lang.Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public java.lang.Double getValor() {
        return valor;
    }

    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(LocalDateTime dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }


    public Prato(){

    }


}
