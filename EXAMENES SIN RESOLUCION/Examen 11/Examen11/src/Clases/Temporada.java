
package Clases;

import java.util.*;


public class Temporada {
    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        episodios=new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public void agregarEpisodio(int numero,String titulo,boolean visto){
        Episodio epi=new Episodio(numero, titulo, visto);
        if(!episodios.contains(epi)){
            episodios.add(epi);    
        }
    
    }
  public Episodio obtenerEpisodio(int episodioenTemporada,int numerotemp){
    if(numerotemp==numero){
      for(Episodio epi:episodios){
          if(epi.getNumero()==episodioenTemporada){
              return epi;   
          }
      }  
    }
        return null;   
  } 
}


