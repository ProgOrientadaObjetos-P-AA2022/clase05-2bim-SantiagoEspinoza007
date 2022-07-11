/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;
import java.io.Serializable;

public class GeneradorPeliculas implements Serializable {
    
    private String nombrePlataforma;
    private APIMovie llave;
    private String url;
    
    public void establecerNombre(String n){
        nombrePlataforma = n;
    }
    
    public void establecerLlave(APIMovie l){ // APINetflix, APIAmazon
        llave = l;
    }
    
    public void establecerUrl(String l){
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }
    
    public String obtenerNombre(){
        return nombrePlataforma;
    }
    
    public APIMovie obtenerLlave(){
        return llave;
    }
    
    public String obtenerUrl(){
        return url;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Plataforma: %s\n"
                + "Url: %s\n",obtenerNombre(), obtenerUrl());
        return reporte;
    }
    
}
