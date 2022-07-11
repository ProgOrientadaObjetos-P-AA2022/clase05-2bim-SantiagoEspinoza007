/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TarjetaCredito TC = new TarjetaCredito("Diners", "800645231287", 1000);
        MayorEdad representante = new MayorEdad("José", TC);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta: (%s) - %s - %.2f\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().getNom(),
                menor.obtenerRepresentante().obtenerTarjeta().getCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().getCupomax());
        
    }
}
