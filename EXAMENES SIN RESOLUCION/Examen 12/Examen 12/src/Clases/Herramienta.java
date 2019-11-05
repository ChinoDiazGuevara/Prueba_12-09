
package Clases;


public class Herramienta {
    private String tipo;
    private int nivel;
    private String nombre;

    public Herramienta(int nivel, String nombre) {
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getNivel() {
        return this.nivel;
    }

    public String getNombre() {
        return this.nombre;
    }
    
}
