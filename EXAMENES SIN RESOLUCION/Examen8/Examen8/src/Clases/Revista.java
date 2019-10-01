
package Clases;

import java.util.*;


public class Revista {
    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.titulo = titulo;
        this.ejemplar = ejemplar;
        this.elementos=new ArrayList<Articulo>();
    }
    public boolean addElemento(Articulo articulo){
        return elementos.add(articulo);
    }
    public Articulo getArticuloEnPosicion(int posicion){
     int posi=0;
         if(posi>=elementos.size()||posi<0)
         {
            return null;
         }
         else{
             System.out.println("La posición "+posi+"existe");
         return elementos.get(posi);
              }
         }
    
    public int getCantidadArticulosDeTema(String tema){
    int cantidad = 0;
    for(Articulo a:this.elementos){
        if(a.contieneTema(tema))
        {
            cantidad++;
        }
    }    
      return cantidad;
    }
}
