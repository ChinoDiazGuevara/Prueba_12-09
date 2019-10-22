
package Clases;

import java.util.*;


public class Curso {
    private String nombre;
    private List<String> alumnos;
    private List<Examen> examenes;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos=new ArrayList<>();
        examenes=new ArrayList<>();
    }
    
 private boolean addAlumno(String alumno){
    if(alumnos.contains(alumno)){
       this.alumnos.add(nombre);
       return true; 
    }
    return false;
}
private boolean addExamen(Examen examen){
  if(examenes.contains(examen)){
       this.examenes.add(examen);
       return true; 
    }
    return false;
}

 private boolean addRespuestas(String temaExamen, String alumno,List<String> respuestas){
     
     if(examenes.contains(temaExamen)){
         if(alumnos.contains(alumno)){
             
         }
     }
     
     
     
     
 }
  
public List<String> Desaprobados(float Pminimo,String TemaExamen){
  List<String> desaprobados;
 Iterator<Examen> pruebasIt=this.examenes.iterator();
    while (pruebasIt.hasNext()) {
        Examen e=pruebasIt.next();
        if(e.esTema(TemaExamen)){
            
        }
    }
     
    
 }
    
    
    
    
    
    
    
    
    
    
    
}
