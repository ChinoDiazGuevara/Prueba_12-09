
package Clases;

import java.util.*;


public class Mision {
    private List<String> requerimientos;
    private String nombre;

    public Mision(String nombre) {
        this.nombre = nombre;
        requerimientos=new ArrayList<>();
    }

    public List<String> getRequerimientos() {
        return this.requerimientos;
    }

    public String getNombre() {
        return this.nombre;
    }
    
}
