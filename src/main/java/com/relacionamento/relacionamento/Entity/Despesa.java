package com.relacionamento.relacionamento.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the IMP_ITREEMBOLSO database table.
 *
 */
@Entity
@Table(name="despesa", schema="estudo")
@NamedQuery(name="Despesa.findAll", query="SELECT i FROM Despesa i")
public class Despesa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="despesa_GENERATOR", sequenceName="CD_DESPESA")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="a_GENERATOR")
    @Column(name="CD_DESPESA")
    private Long id;

    private String utilizador_matricula;
    private String utilizador_nome;
    private String id_tipo_reembolso;
    private String prestador_documento;
    private String data_despesa;
    private String valor_despsa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="CD_DESPESA")
    private List<Arquivo> arquivos;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUtilizador_matricula() {
        return utilizador_matricula;
    }

    public void setUtilizador_matricula(String utilizador_matricula) {
        this.utilizador_matricula = utilizador_matricula;
    }

    public String getUtilizador_nome() {
        return utilizador_nome;
    }

    public void setUtilizador_nome(String utilizador_nome) {
        this.utilizador_nome = utilizador_nome;
    }

    public String getId_tipo_reembolso() {
        return id_tipo_reembolso;
    }

    public void setId_tipo_reembolso(String id_tipo_reembolso) {
        this.id_tipo_reembolso = id_tipo_reembolso;
    }

    public String getPrestador_documento() {
        return prestador_documento;
    }

    public void setPrestador_documento(String prestador_documento) {
        this.prestador_documento = prestador_documento;
    }

    public String getData_despesa() {
        return data_despesa;
    }

    public void setData_despesa(String data_despesa) {
        this.data_despesa = data_despesa;
    }

    public String getValor_despsa() {
        return valor_despsa;
    }

    public void setValor_despsa(String valor_despsa) {
        this.valor_despsa = valor_despsa;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
}
