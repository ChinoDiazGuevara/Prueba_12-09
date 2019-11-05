
package Clases;

import java.util.*;

public class Serie {
    private String nombre;
    private List<Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
        temporadas=new ArrayList<>();
    }

    Serie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public void agregarTemporada(int numero){
       Temporada nueva=new Temporada(numero);
       temporadas.add(nueva);
   }
   public Temporada buscarTemporada(int tempo){
       for(Temporada tem:temporadas){
           if(tem.equals(tempo)){
               return tem;
           }
       }
       return null;
   }
}
