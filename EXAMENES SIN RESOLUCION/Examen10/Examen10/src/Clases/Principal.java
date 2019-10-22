
package Clases;
import Clases.Poliza;

public class Principal {
    
    public static void main(String[] args) {
   ObjetodeValor obj1=new ObjetodeValor("Computadora",500);
   ObjetodeValor obj2=new ObjetodeValor("Plancha",1500);
   ObjetodeValor obj3=new ObjetodeValor("Cocina",2500);
   Poliza poli=new Poliza(1);
   poli.addObjeto(obj1);
   poli.addObjeto(obj2);
   poli.addObjeto(obj3);
   Poliza poli2=new Poliza(2);
   poli2.addObjeto(obj3);
   Aseguradora ase=new Aseguradora("Sancor");
   ase.addPoliza(poli);
   ase.addPoliza(poli2);
           System.out.println("Aplicando metodo valorObjeto "+ase.valorObjeto(1,"Plancha"));
           
    }
   
}
