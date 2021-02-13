package com.relacionamento.relacionamento.Entity;

public class ReembolsoRetornoErro {

    private String protocolo;
    private String mshash;
    private String status = "2";

    public ReembolsoRetornoErro(Reembolso reembolso) {
        this.protocolo = reembolso.getProtocolo();
        this.mshash = reembolso.getMshash();
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getMshash() {
        return mshash;
    }

    public void setMshash(String mshash) {
        this.mshash = mshash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
