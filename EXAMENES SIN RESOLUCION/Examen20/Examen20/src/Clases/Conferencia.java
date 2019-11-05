
package Clases;

import java.util.*;

public class Conferencia {
    public SalaDeConferencia sala;
    public Date fechaInicio;
    public Date fechaFin;
    public ArrayList<String> invitados;

    public Conferencia(SalaDeConferencia sala) {
        this.sala = sala;
        invitados=new ArrayList<>();
    }

    public SalaDeConferencia getSala() {
        return sala;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void addInvitado(String invitado){
        if(!invitados.contains(invitado)){
            invitados.add(invitado);
        }
    }
    
    public boolean tieneInvitado(String nombre){
        if(invitados.size()>0){
            return true;
        }
        return false;
    }
    
    public boolean contieneFecha(Date fecha){
        if(fecha.after(fechaInicio) || fecha.before(fechaFin)){
            return true;
        }
        return false;
    }
    
    public 
}
