package com.relacionamento.relacionamento.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="reembolso", schema="estudo")
@NamedQuery(name="Reembolso.findAll", query="SELECT i FROM Reembolso i")
public class Reembolso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="reembolso", sequenceName="CD_REEMBOLSO")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="r_GENERATOR")
    @Column(name="CD_REEMBOLSO")
    private Long id;
    @NotBlank(message = "Campo [protocolo] inválido")
    private String protocolo;
    @NotBlank(message = "Campo [id_operadora] inválido")
    private String id_operadora;
    @NotBlank(message = "Campo [mshash] inválido")
    private String mshash;
    @NotBlank(message = "Campo [matricula_titular] inválido")
    private String matricula_titular;
    @NotBlank(message = "Campo [matricula_beneficiario] inválido")
    private String matricula_beneficiario;
    @NotBlank(message = "Campo [cpf_titular] inválido")
    private String cpf_titular;
    private String telefone;// nao obrigatorio
    private String nome_titular;// nao obrigatorio
    private String operadora_ans;// nao obrigatorio
    @NotBlank(message = "Campo [utilizado_matricula] inválido")
    private String utilizado_matricula;
    @NotBlank(message = "Campo [utilizador_nome] inválido")
    private String utilizador_nome;
    @NotBlank(message = "Campo [id_tipo_reembolso] inválido")
    private String id_tipo_reembolso;
    @NotBlank(message = "Campo [prestador_documento] inválido")
    private String prestador_documento;
    @NotBlank(message = "Campo [data_despesa] inválido")
    private String data_despesa;
    @NotBlank(message = "Campo [valor_despsa] inválido")
    private String valor_despsa;
    @NotBlank(message = "Campo [url] inválido")
    private String url;
    @NotBlank(message = "Campo [nome] inválido")
    private String nome;
    @NotBlank(message = "Campo [diretorio] inválido")
    private String diretorio;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="CD_REEMBOLSO")
    private List<Despesa> despesas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="CD_REEMBOLSO")
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

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
}
