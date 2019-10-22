
package Clases;

import java.util.*;


public class Examen {
    private String tema;
    private List<Pregunta> preguntas;
    private List<List<String>> respuestasAlumnos;
    private List<String> alumnos;

    public Examen(String tema) {
        this.tema = tema;
        preguntas=new ArrayList<>();
        respuestasAlumnos=new ArrayList<List<String>>();
        alumnos=new ArrayList<>();
    }

    Examen() {

    }
    
 public float calificarRespuestas(List<String> respuestas){
     float calificacion = 0;
     Pregunta preg=new Pregunta();
     
     for(int i=0;i<preguntas.size();i++){
        if(preguntas.get(i).equals(respuestas.get(i))){
            if(preg.esCorrecta(respuestas.get(i))){
            calificacion=calificacion+preg.getPuntaje(respuestas.get(i));    
            }   
        }
     }
     return calificacion;
 }
 public String esTema(String temaa){
     if(temaa.equals(tema)){
         return temaa;
     }
     return null;
 }
 

 
 
 public boolean addRespuestas(){
     
 }
 
 
 
 
 
}
