/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author eduar
 */


public class Republica {
    protected String nome;
    protected LocalDate fundacao;
    protected LocalDate extincao;
    protected Endereco endereco;
    protected String vantagens;
    protected double despesaMorador;
    protected int vagas;
    protected int vagasOcupadas;
    protected int vagasDisponiveis;
    protected ArrayList<Morador> moradores = new ArrayList<>();

    public Republica(String nome, Endereco endereco, String vantagens, double despesaMorador, int vagas, Morador morador) {
        this.nome = nome;
        this.fundacao = LocalDate.now();
        this.endereco = endereco;
        this.vantagens = vantagens;
        this.despesaMorador = despesaMorador;
        this.vagas = vagas;
        this.vagasOcupadas = 0;
        this.vagasDisponiveis = this.vagas;
        this.addMorador(morador);
        morador.setRepresentante(true);
    }
    
    public void addMorador(Morador morador) {
        if (morador == null) {
            throw new RuntimeException("Morador não pode ser nulo!");
        }
        
        if (this.vagasDisponiveis > 0) {
            Optional<Morador> moradorEncontrado = getMoradorPorNome(morador.getNome());
            if(!moradorEncontrado.isPresent()) {
                moradores.add(morador);
                this.vagasDisponiveis--;this.vagasOcupadas++;
            }   else {
                throw new RuntimeException("Morador já está em uma república");
            }
        }   else {
            throw new RuntimeException("Republica cheia");
        }
    }
    
    public Optional<Morador> getMoradorPorNome(String nome) {
        Optional<Morador> moradorEncontrado = Optional.empty();
        for(Morador morador : this.getMoradores()) {
            if (morador.getNome().toUpperCase().equals(nome.toUpperCase())) {
                moradorEncontrado = Optional.of(morador);
            }
        }
        return moradorEncontrado;
    }
    
    public void removerMorador(String nomeMorador) {
        Optional<Morador> moradorEncontrado = getMoradorPorNome(nomeMorador);
        if(!moradorEncontrado.isPresent()) {
            throw new RuntimeException("Morador " + nomeMorador + " não encontrado!");
        }
        HistoricoMorador historico = new HistoricoMorador(this);
        moradorEncontrado.get().getHistorico().add(historico);
        this.getMoradores().remove(moradorEncontrado.get());
        this.vagasDisponiveis++;this.vagasOcupadas--;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public LocalDate getExtincao() {
        return extincao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getVantagens() {
        return vantagens;
    }

    public double getDespesaPorMorador() {
        return despesaMorador;
    }

    public int getVagas() {
        return vagas;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public ArrayList<Morador> getMoradores() {
        return moradores;
    }

    @Override
    public String toString() {
        return "Republica: \r\n" + "Nome: " + nome + "\nData da Fundação: " + fundacao + "\nData da Extinção: " + extincao + 
                "\n Endereço: " + endereco + "\nVantagens: " + vantagens + "\nDespesa Por Morador:" +
                despesaMorador + "\nVagas: " + vagas + "\nVagas Ocupadas:" + vagasOcupadas +
                "\nvagasDisponiveis=" + vagasDisponiveis + "\nMoradores: \r\n" + moradores + "\r\n";
    }
}

