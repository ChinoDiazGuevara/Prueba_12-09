
package Clases;


public class Episodio {
    private int numero;
    private String titulo;
    private boolean visto;

    public Episodio(int numero, String titulo, boolean visto) {
        this.numero = numero;
        this.titulo = titulo;
        this.visto = visto;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }
    public boolean fueVisto(){
        if(visto==true){
            return true;
        }
        return false;
    }
}
