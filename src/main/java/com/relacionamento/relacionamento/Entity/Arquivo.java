package com.relacionamento.relacionamento.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="arquivo", schema="estudo")
@NamedQuery(name="Arquivo.findAll", query="SELECT i FROM Arquivo i")
public class Arquivo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="arquivo_GENERATOR", sequenceName="CD_ARQUIVO")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="b_GENERATOR")
    @Column(name="CD_ARQUIVO")
    private Long id;

    private String url;
    private String nome;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
