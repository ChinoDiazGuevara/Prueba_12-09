
package Clases;


public class Foto {
    private String[] personasEnFoto;
    private String nombreArchivo;
    private int tamano;
    private String descripcion;

    public Foto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getTamano() {
        return this.tamano;
    }

    public String[] getPersonasEnFoto(int pos) {
        return personasEnFoto;
    }

    public void setPersonasEnFoto(int pos,String persona) {
        this.personasEnFoto = personasEnFoto;
    }
        
}
