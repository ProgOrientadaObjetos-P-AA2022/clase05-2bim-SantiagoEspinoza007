/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Edgar Espinoza
 */
public class TransporteTransvia {
    private String cooperativaTransvia;
    private double tarifa;

    public void setCooperativaTransvia(String coopTrans) {
        cooperativaTransvia = coopTrans;
    }

    public void setTarifa() {
        tarifa = 3.00 + 0.50;
    }

    public String getCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public double getTarifa() {
        return tarifa;
    }
    
    
}
