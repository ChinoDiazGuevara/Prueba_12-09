
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
    
}
