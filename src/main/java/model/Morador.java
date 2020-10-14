/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author eduar
 */


public class Morador {
    protected String nome;
    protected String apelido;
    protected String phone;
    protected String linkRedeSocial;
    protected String phoneResponsavel1;
    protected String phoneResponsavel2;
    protected boolean representante;
    protected ArrayList<HistoricoMorador> historico = new ArrayList<>();

    public Morador(String nome, String apelido, String telefone, String linkRedeSocial, String telefoneResponsavel1, String telefoneResponsavel2) {
        this.nome = nome;
        this.apelido = apelido;
        this.phone = telefone;
        this.linkRedeSocial = linkRedeSocial;
        this.phoneResponsavel1 = telefoneResponsavel1;
        this.phoneResponsavel2 = telefoneResponsavel2;
        this.representante = false;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getTelefone() {
        return phone;
    }

    public String getLinkRedeSocial() {
        return linkRedeSocial;
    }

    public String getTelefoneResponsavel1() {
        return phoneResponsavel1;
    }

    public String getTelefoneResponsavel2() {
        return phoneResponsavel2;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public ArrayList<HistoricoMorador> getHistorico() {
        return historico;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Morador\r\n" + "Nome: " + nome + "\nApelido: " + apelido + "\nTelefone: " + phone + "\nRede Social:" +
                linkRedeSocial + "\n1 Telefone Responsavel=" + phoneResponsavel1 + "\n2 Telefone Responsavel: " +
                phoneResponsavel2 + "\nRepresentante: " + representante + "\nHistórico: " + historico;
    }
}