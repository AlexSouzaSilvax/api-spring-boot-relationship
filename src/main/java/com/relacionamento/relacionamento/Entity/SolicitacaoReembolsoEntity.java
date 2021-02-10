package com.relacionamento.relacionamento.Entity;

import java.util.List;

public class SolicitacaoReembolsoEntity {

    private String protocolo;
    private String id_operadora;
    private String mshash;
    private String matricula_titular;
    private String matricula_beneficiario;
    private String cpf_titular;
    private String telefone;// nao obrigatorio
    private String nome_titular;// nao obrigatorio
    private String operadora_ans;// nao obrigatorio
    private List<SolicitacaoReembolsoDespesaEntity> despesas;
    private String utilizado_matricula;
    private String utilizador_nome;
    private String id_tipo_reembolso;
    private String prestador_documento;
    private String data_despesa;
    private String valor_despsa;
    private List<SolicitacaoReembolsoArquivoEntity> arquivos;
    private String url;
    private String nome;
    private String diretorio;

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getId_operadora() {
        return id_operadora;
    }

    public void setId_operadora(String id_operadora) {
        this.id_operadora = id_operadora;
    }

    public String getMshash() {
        return mshash;
    }

    public void setMshash(String mshash) {
        this.mshash = mshash;
    }

    public String getMatricula_titular() {
        return matricula_titular;
    }

    public void setMatricula_titular(String matricula_titular) {
        this.matricula_titular = matricula_titular;
    }

    public String getMatricula_beneficiario() {
        return matricula_beneficiario;
    }

    public void setMatricula_beneficiario(String matricula_beneficiario) {
        this.matricula_beneficiario = matricula_beneficiario;
    }

    public String getCpf_titular() {
        return cpf_titular;
    }

    public void setCpf_titular(String cpf_titular) {
        this.cpf_titular = cpf_titular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getOperadora_ans() {
        return operadora_ans;
    }

    public void setOperadora_ans(String operadora_ans) {
        this.operadora_ans = operadora_ans;
    }

    public List<SolicitacaoReembolsoDespesaEntity> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<SolicitacaoReembolsoDespesaEntity> despesas) {
        this.despesas = despesas;
    }

    public String getUtilizado_matricula() {
        return utilizado_matricula;
    }

    public void setUtilizado_matricula(String utilizado_matricula) {
        this.utilizado_matricula = utilizado_matricula;
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

    public List<SolicitacaoReembolsoArquivoEntity> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<SolicitacaoReembolsoArquivoEntity> arquivos) {
        this.arquivos = arquivos;
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

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }
}
