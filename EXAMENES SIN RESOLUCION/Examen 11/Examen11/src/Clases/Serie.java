
package Clases;

import java.util.*;

public class Serie {
    private String nombre;
    private List<Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
        temporadas=new ArrayList<>();
    }
   public void agregarTemporada(int numero){
       Temporada nueva=new Temporada(numero);
       temporadas.add(nueva);
   }
}
