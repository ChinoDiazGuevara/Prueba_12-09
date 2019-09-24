
package Clases;
import java.util.*;

public class ItemStock {
   private Date ultimafechaModificacion;
   private int cantidad;
   private Computadora computadora;

    public ItemStock(int cantidad, Computadora computadora) {
        this.cantidad = cantidad;
        this.computadora = computadora;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Computadora getComputadora() {
        return this.computadora;
    }

}
