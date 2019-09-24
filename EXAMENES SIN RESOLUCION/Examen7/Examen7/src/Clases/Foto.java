
package Clases;


public class Foto {
    private String[] personasEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripcion;

    public Foto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String[] getPersonasEnFoto(int pos, String persona) {
        return this.personasEnFoto;
    }

    public int getTamaño() {
        return this.tamaño;
    }

    public void setPersonasEnFoto(String[] personasEnFoto) {
        this.personasEnFoto = personasEnFoto;
    }    
}
