
package Clases;

import java.sql.Time;
import java.util.*;


public class Turno {
    private Date dia;
	private Time hora;
	private int nroConsultorio;
        private int nroPaciente;

    public Turno(Date dia, Time hora, int nroConsultorio, int nroPaciente) {
        this.dia = dia;
        this.hora = hora;
        this.nroConsultorio = nroConsultorio;
        this.nroPaciente = nroPaciente;
    }
        

}
