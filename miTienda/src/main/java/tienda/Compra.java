/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author usuario
 */
public class Compra {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca id de articulo: ");
        int id = sc.nextInt();
        System.out.println("Introduzca pvp de articulo: ");
        int pvp = sc.nextInt();
        System.out.println("Introduzca cantidad de articulo: ");
        int cantidad = sc.nextInt();
        Articulo a = new Articulo (cantidad, pvp, id, cantidad);
        A.add(a);
    
    
}
