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
public class Articulo {

    private int pvp;
    private int id;
    private int stock;

    public Articulo(int pvp, int id, int stock) {
        this.pvp = pvp;
        this.id = id;
        this.stock=stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getPvp() {
        return pvp;
    }

    public int getId() {
        return id;
    }



    public void setPvp(int pvp) {
        this.pvp = pvp;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}
