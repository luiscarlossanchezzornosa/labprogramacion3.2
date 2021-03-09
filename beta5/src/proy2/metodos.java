/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2;
import java.util.List;


/**
 *
 * @author paule
 */

public class metodos{  
    
entrada pla=new entrada();

    public void margersort(int mt){
//List mt2 = mt;
    orden mg=new orden();
    int []modelo = {mt};
    int [] arrayordenado=mg.magesort(modelo);
    for(int i=0;i<modelo.length;i++)
        {
           pla.entradas(Integer.parseInt(toString()));
            //mt.margersort((Integer.parseInt(datos.getModel().getValueAt(0, 1).toString())));
        }
 }
   public void burbuja(int mt){
     int [] modelos={mt};
     orden o=new orden();
     o.ordenburbuja(modelos);
      for(int i=0;i<modelos.length;i++);
     {
         pla.entradas((Integer.parseInt(pla.toString())));
     }
    }
}  



//mt.margersort((Integer.parseInt(datos.getModel().getValueAt(0, 1).toString())));