/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author eduar
 */
public enum UFEnums {
    AC(1),
    AL(2),
    AM(3),
    AP(4),
    BA(5),
    CE(6),
    DF(7),
    ES(8),
    GO(9),
    MA(10),
    MT(11),
    MS(12),
    MG(13),
    PA(14),
    PB(15),
    PR(16),
    PE(17),
    PI(18),
    RN(19),
    RS(20),
    RJ(21),
    RO(22),
    RR(23),
    SC(24),
    SP(25),
    SE(26),
    TO(27);
    
    private int valor;
    
    UFEnums(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
