/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        OperacionesEstudiantes oE = new OperacionesEstudiantes();
        ArrayList <Persona> lista = new ArrayList<>();
               
        Persona p = new Persona("Edgar", 18);
        lista.add(p);
        Persona p1 = new Persona("Jostin", 18);
        lista.add(p1);
        Persona p2 = new Persona("Evelyn", 20);
        lista.add(p2);
        Persona p3 = new Persona("David", 9);
        lista.add(p3);
        Persona p4 = new Persona("Joel", 16);
        lista.add(p4);
        Persona p5 = new Persona("Ivan", 14);
        lista.add(p5);
        
        oE.establecerEstudiante(lista);
        oE.establecerPromedioEdades();
        
        System.out.printf("%s",oE);
        
    }
}
