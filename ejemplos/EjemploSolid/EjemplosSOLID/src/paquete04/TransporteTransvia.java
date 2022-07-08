/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import paquete03.*;

/**
 *
 * @author Edgar Espinoza
 */
public class TransporteTransvia extends Transporte{
    private String cooperativaTransvia;

    public void setCooperativaTransvia(String coopTrans) {
        cooperativaTransvia = coopTrans;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 3.00 + 0.50;
    }

    public String getCooperativaTransvia() {
        return cooperativaTransvia;
    }  
    
}
