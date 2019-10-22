
package Clases;

import java.util.List;


public class Pregunta {
    private String consigna;
    private String respuesta;
    private float puntaje;

    public Pregunta(String consigna, String respuesta, float puntaje) {
        this.consigna = consigna;
        this.respuesta = respuesta;
        this.puntaje = puntaje;
    }

    public Pregunta() {
        
    }
    public boolean esCorrecta(String Respuesta){
       if(Respuesta==respuesta){
           return true;
       }
       return false;
    }

    public float getPuntaje(String Respuesta) {
      if(respuesta==Respuesta){
           return puntaje;
       }
    return 0;
    }

    
}
