/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Venta {
    
    private Articulo art;

    
    
    public Venta(Articulo art) {
        this.art = art;
    }
       
    public void vender (ArrayList<Articulo> articulos)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduzca el nombre del ID a vender: ");
        int id = sc.nextInt();
        for (int i = 0; i < articulos.size(); i++) {
            if(articulos.get(i).getId() == id)
            {                
                articulos.get(i).setStock(articulos.get(i).getStock()-1);
                if(articulos.get(i).getStock()==0)
                {
                    articulos.remove(i);//
                }
            }
        }
        
        
    }
    
    
    
    
    
    
}

