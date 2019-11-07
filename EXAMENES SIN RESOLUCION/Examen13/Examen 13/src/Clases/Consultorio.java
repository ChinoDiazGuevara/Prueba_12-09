
package Clases;

import java.sql.Time;
import java.util.*;


public class Consultorio {
        private int nroConsultorio;
	private String medico;
	private List<Turno> turnos;

public Consultorio(){
	this.nroConsultorio=nroConsultorio;
	this.medico=medico;
	turnos=new ArrayList<>();
                    }

public void agregarTurno(Date dia,Time hora,int nroPaciente){
	Turno agregar=new Turno(dia,hora,nroConsultorio,nroPaciente);
	turnos.add(agregar);
}
 

}
