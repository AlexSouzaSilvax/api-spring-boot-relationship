package com.relacionamento.relacionamento.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SolicitacaoReembolsoArquivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    private String nome;
    private Long cd_solic_reem;
    private Long cd_solic_reem_desp;

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

    public Long getCd_solic_reem() {
        return cd_solic_reem;
    }

    public void setCd_solic_reem(Long cd_solic_reem) {
        this.cd_solic_reem = cd_solic_reem;
    }

    public Long getCd_solic_reem_desp() {
        return cd_solic_reem_desp;
    }

    public void setCd_solic_reem_desp(Long cd_solic_reem_desp) {
        this.cd_solic_reem_desp = cd_solic_reem_desp;
    }
}
