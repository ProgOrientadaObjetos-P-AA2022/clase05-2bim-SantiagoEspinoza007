/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia trans = new TransporteTransvia();
        trans.setCooperativaTransvia("Metro Veloz");
        trans.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList <Transporte> t = new ArrayList<>();
        t.add(bus);
        t.add(taxi);
        t.add(trans);
        
        tipos.establecerTransportes(t);
        tipos.establecerPromedioTarifas();
                
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
