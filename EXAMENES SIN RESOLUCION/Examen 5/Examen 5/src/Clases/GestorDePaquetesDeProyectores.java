
package Clases;

import java.util.*;
import Clases.PaquetesProyectores;

public class GestorDePaquetesDeProyectores {
private List<PaquetesProyectores> paquetes;
private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        paquetes=new ArrayList<>();
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void agregarPaquete(PaquetesProyectores paqueteNuevo){
        paquetes.add(paqueteNuevo);
    }
public void buscarPaqueteDeProyectores (int codPaq){
    int codigo;
    for(int i=0;i<paquetes.size();i++){
        if(codPaq==paquetes.get(i).getCodPaqueteDeProyectores()){
            codigo=;
        }
    }
}








}
