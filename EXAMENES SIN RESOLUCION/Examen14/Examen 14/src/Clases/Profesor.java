
package Clases;

import java.util.*;


public class Profesor extends Persona{
	private List<String> especialidades;
	private int distanciaASede;
	private String telefono;

public Profesor (String dni,String nombre,int distanciaASede, String telefono){
	super(dni,nombre);
	this.distanciaASede=distanciaASede;
	this.telefono=telefono;
	especialidades=new ArrayList<>();	
}

public List<String> getEspecialidades(){
	return especialidades;
}	

public int getDistanciaASede(){
	return distanciaASede;
}

public String getTelefono(){
	return telefono;
}

public void addEspecialidad (String especialidad){
	for(String orientacion:especialidades){
		if(!orientacion.equals(especialidad)){
			especialidades.add(especialidad);
		}
	}
}

@Override
public String toString(){
	return super.getDni()+", "+
	super.getNombre()+", "+
	this.telefono+", "+
	this.especialidades.size()+", "+
	this.distanciaASede; 	
}
}
