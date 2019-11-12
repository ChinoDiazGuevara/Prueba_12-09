
package Clases;

import java.util.*;


public class Profesor {
    private List<String> especialidades;
    private int distanciaASede;
    private String telefono;

    public Profesor(int distanciaASede, String telefono) {
        this.distanciaASede = distanciaASede;
        this.telefono = telefono;
        especialidades=new ArrayList<>();
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
