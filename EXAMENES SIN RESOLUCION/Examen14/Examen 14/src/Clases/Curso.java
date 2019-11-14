
package Clases;

import java.util.*;


public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Profesor> suplentes;
    private List<Alumno> alumnos;
    private List<Float> notas;
    private int cupo;
    private String modalidad;

    public Curso(String nombre, Profesor profesor, int cupo, String modalidad) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupo = cupo;
        this.modalidad = modalidad;
    }
public Profesor getMejorSuplente(int distancia){
	Profesor mejor=null;
	for(Profesor profsupl:suplentes){
		if(profsupl.getDistanciaASede()<=distancia && profsupl.getTelefono()!=""){
                  if(profsupl.getEspecialidades().size()>mejor.getEspecialidades().size()){
                    mejor=profsupl;
                    distancia=mejor.getDistanciaASede();
                  }
		}
	}
        return mejor;
}

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }

public boolean agregarAlumno(Alumno alumnoNuevo){
    if(alumnoNuevo.getLocalidad().equals("Posadas")&& modalidad.equals("Presencial")&& alumnos.size()<=cupo){
        alumnos.add(alumnoNuevo);
        return true;
    }
    if(modalidad.equals("Virtual")){
        alumnos.add(alumnoNuevo);
    }
    return false;
}

}



















