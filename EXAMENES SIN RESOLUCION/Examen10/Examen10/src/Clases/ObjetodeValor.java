
package Clases;


public class ObjetodeValor {
    private String nombre;
    private double valor;

    public ObjetodeValor(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    ObjetodeValor() {

    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
    
}
