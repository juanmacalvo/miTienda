/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Principal {
    
    public static void main(String[] args){
        ArrayList<Articulo> lista;
        lista=new ArrayList<>();
        
        
        //compramos al proveedor
        Compra c1 = new Compra();
        c1.compra(lista);
        
        //vendemos productos al cliente
        Venta v1=new Venta();
        v1.vender(lista);
       
        
        
    }
    
}
