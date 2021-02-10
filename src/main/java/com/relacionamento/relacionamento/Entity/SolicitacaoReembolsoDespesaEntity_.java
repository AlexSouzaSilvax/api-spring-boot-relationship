package com.relacionamento.relacionamento.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class SolicitacaoReembolsoDespesaEntity_ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String utilizador_matricula;
    private String utilizador_nome;
    private String id_tipo_reembolso;
    private String prestador_documento;
    private String data_despesa;
    private String valor_despsa;
    private Long cd_solic_reem;

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

    public Long getCd_solic_reem() {
        return cd_solic_reem;
    }

    public void setCd_solic_reem(Long cd_solic_reem) {
        this.cd_solic_reem = cd_solic_reem;
    }
}
