/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Edgar Espinoza
 */
public class TarjetaCredito {
    private String nom;
    private String codigo;
    private double cupomax;

    public TarjetaCredito(String n, String cod, double cm) {
        nom = n;
        codigo = cod;
        cupomax = cm;
    }
    
    public void setNom(String n) {
        nom = n;
    }

    public void setCodigo(String cod) {
        codigo = cod;
    }

    public void setCupomax(double cm) {
        cupomax = cm;
    }

    public String getNom() {
        return nom;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCupomax() {
        return cupomax;
    }
    
    
    
}
