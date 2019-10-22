
package Clases;

import java.util.*;


public class Poliza {
    private int idPoliza;
    private List<ObjetodeValor> objetodevalor;

    public Poliza(int idPoliza) {
        this.idPoliza = idPoliza;
        objetodevalor=new ArrayList<>();
    }

    Poliza() {

    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public List<ObjetodeValor> getObjetodevalor() {
        return objetodevalor;
    }
    public void agregarObjetodeValor(String nombre, Double valor){
        ObjetodeValor objeto=new ObjetodeValor(nombre,valor);
        objetodevalor.add(objeto);
    }
    public void addObjeto(ObjetodeValor o){
        objetodevalor.add(o);
    }

    public ObjetodeValor buscarObjeto(String nombre){
   for(ObjetodeValor oj:objetodevalor){
       if(oj.getNombre().equals(nombre)){
           return oj;
       }
   } 
        return null;
  }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public void setObjetodevalor(List<ObjetodeValor> objetodevalor) {
        this.objetodevalor = objetodevalor;
    }
  
}
