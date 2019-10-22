
package Clases;

import java.lang.reflect.Array;
import java.util.*;


public class Aseguradora {
    private int idAseguradora;
    private String nombre;
    private String ciudad;
    private List<Poliza> polizas;

    public Aseguradora(String nombre) {
        this.nombre = nombre;
        polizas=new ArrayList<>();
    }

    public List<Poliza> getPolizas() {
        return this.polizas;
    }
    public void agregarPoliza (int idPoliza,List<ObjetodeValor> lista){
        Poliza p=new Poliza();
        p.setIdPoliza(idPoliza);
        p.setObjetodevalor(lista);
        polizas.add(p);
   
    }
    public void addPoliza(Poliza poli){
        polizas.add(poli);
    }
    public Double valorObjeto(int idPoliza,String nombre){
        ObjetodeValor objeto=new ObjetodeValor();
        
        for(Poliza po:polizas){
            if(po.getIdPoliza()==idPoliza){
            objeto=po.buscarObjeto(nombre);
            if(objeto==null){
                return null;
            }
            else{
                return objeto.getValor();
            }
        }
        }
        return null;
    }
}
