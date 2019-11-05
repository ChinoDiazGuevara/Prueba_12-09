
package Clases;

import java.util.*;


public class Personaje {
    private List<Mision> misionesCompletadas;
    private List<Herramienta> inventario;
    private int nivel=0;
    private int experiencia;
    private String nombre;

    public Personaje(int nivel, String nombre) {
        this.nivel = nivel;
        this.nombre = nombre;
        misionesCompletadas=new ArrayList<>();
        inventario=new ArrayList<>();
    }

    public int getNivel() {
        return this.nivel;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void addExperiencia(int exp){
        experiencia=experiencia+exp;
    }
    public void addInventario(Herramienta herramienta){
        if(!inventario.contains(herramienta)){
            inventario.add(herramienta);
        }
    }
    
    public void addMisionCompletada(Mision mision){
        if(!misionesCompletadas.contains(mision)){
            misionesCompletadas.add(mision);
        }   
    }
    
    public List<Herramienta> ListaHerramienta(String herra){
      List<Herramienta> ListaDeHerramientas = null;
        for(Herramienta in:inventario){
           if(in.getTipo().equals(herra)){
               
               if(in.getNivel()<=nivel){
                  ListaDeHerramientas.add(in);
               }    
           }
       }
        return ListaDeHerramientas;
    }
    
}
