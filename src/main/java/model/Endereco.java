/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.UFEnums;

/**
 *
 * @author eduar
 */
public class Endereco {
    protected String cep;
    protected String bairro;
    protected String referencia;
    protected int numero;
    protected String logradouro;
    protected UFEnums uf;

    public Endereco(String cep, String bairro, String referencia, int numero, String logradouro, UFEnums uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.referencia = referencia;
        this.numero = numero;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public Endereco(String cep, String bairro, int numero, String logradouro, UFEnums uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public UFEnums getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco:\r\n" + "CEP: " + cep + ", Bairro: " + bairro + ", Ponto de Referencia: " + referencia + ", Número: " +
                numero + ", Logradouro: " + logradouro + ", UF: " + uf;
    }
}