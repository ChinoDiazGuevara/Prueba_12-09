
package Clases;

import java.util.*;


public class Articulo {
    private String titulo;
    private String periodista;
    private List <String> temas;
    private int palabras;
    private String texto;
    private long idArticulo;

    public Articulo(String titulo, String periodista, int palabras, String texto, long idArticulo) {
        this.titulo = titulo;
        this.periodista = periodista;
        this.palabras = palabras;
        this.texto = texto;
        this.idArticulo = idArticulo;
        this.temas=new ArrayList<String>();
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public int getPalabras() {
        return this.palabras;
    }

    public void setPeriodista(String periodista) {
        this.periodista = periodista;
    }

    public String getPeriodista() {
        return this.periodista;
    }
    
    public boolean addTema(String tema){
        return temas.add(tema);
    }
    public boolean contieneTema(String tema){
     return temas.contains(tema);
    }   
    
}
