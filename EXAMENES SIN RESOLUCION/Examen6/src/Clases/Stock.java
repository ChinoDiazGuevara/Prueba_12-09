
package Clases;
import java.util.*;


public class Stock {
    private List<ItemStock> items=new ArrayList<>();

    public List<ItemStock> getItems() {
        return new ArrayList<ItemStock>(this.items);   
    }

    public void setItems(List<ItemStock> newItems) {
        this.items =new ArrayList<ItemStock>(newItems);
    }
public List<ItemStock> consulItemFaltantes(int cantidadMaxima){
    List<ItemStock> resultado=new ArrayList<ItemStock>();
    for(ItemStock item:this.items){
        if(item.getCantidad()<=cantidadMaxima){
            resultado.add(item);
        }
    }
    return resultado; 
}
}
