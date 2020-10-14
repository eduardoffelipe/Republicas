/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduar
 */
public class HistoricoMorador {
    protected Republica republica;
    protected double reputacao;

    public HistoricoMorador(Republica republica) {
        this.republica = republica;
    }

    public Republica getRepublica() {
        return republica;
    }

    @Override
    public String toString() {
        return "HistoricoMorador{" + "republica=" + republica + ", reputacao=" + reputacao + '}';
    }
    
}
