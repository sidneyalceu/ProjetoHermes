/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sidney.wanderley
 */
public class Estacao {
    private String id;
    private String codigoEstacao;
    private String siglaEstacao;
    private String endereco;
    private String tipoEstacao;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the codigoEstacao
     */
    public String getCodigoEstacao() {
        return codigoEstacao;
    }

    /**
     * @param codigoEstacao the codigoEstacao to set
     */
    public void setCodigoEstacao(String codigoEstacao) {
        this.codigoEstacao = codigoEstacao;
    }

    /**
     * @return the siglaEstacao
     */
    public String getSiglaEstacao() {
        return siglaEstacao;
    }

    /**
     * @param siglaEstacao the siglaEstacao to set
     */
    public void setSiglaEstacao(String siglaEstacao) {
        this.siglaEstacao = siglaEstacao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the tipoEstacao
     */
    public String getTipoEstacao() {
        return tipoEstacao;
    }

    /**
     * @param tipoEstacao the tipoEstacao to set
     */
    public void setTipoEstacao(String tipoEstacao) {
        this.tipoEstacao = tipoEstacao;
    }
    
    
}
