
package Clases;

import java.util.*;

public class Album {
    private List<Foto> fotos;
    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion= new Date();

    public Album(String nombre, int cantidadMaxima) {
        this.nombre = nombre;
        this.cantidadMaxima = cantidadMaxima;
        this.fotos= new ArrayList<Foto>();
    }
    
    public List<Foto> getFotos() {
       return new ArrayList<Foto>(this.fotos) ;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidadMaxima() {
        return this.cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void addFoto(Foto Nueva){
    this.fotos.add(Nueva);
    }
    
    public boolean tieneFotoConTamañoMenor(int umbral){
        for(Foto calidad:this.fotos){
           if(calidad.getTamano()<umbral){
               System.out.println("Foto de tamaño menor");
           }
           if(calidad.getTamano()==0){
            return true;   
           }
       }
        return false;
    }
}
