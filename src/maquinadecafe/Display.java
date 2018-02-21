/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecafe;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Display {

    /**
     * Objeto de tipo dinero 
     * Objeto de tipo Botonera
     *
     * @param din es el objeto de tipo dinero
     * @param bot es el objeto de tipo botonera
     */
    Dinero din = new Dinero();
    Botonera bot = new Botonera();

    /**
     * Muestra el precio del producto seleccionado.
     *
     * @param prd Recibe el producto seleccionado.
     * @return True
     */
    public boolean mostrarPrecio(Producto prd) {
        JOptionPane.showMessageDialog(null, "Precio: " + prd.getPrecio() + "€");
        return true;

    }

    /**
     * Muestra la cantidad de azúcar que el usuario ha seleccionado
     *
     * @return True
     */
    public boolean mostrarAzucar() {
        JOptionPane.showMessageDialog(null, "Azúcar: " + Producto.getAzucar());
        return true;
    }

    /**
     * Muestra el producto seleccionado.
     *
     * @param prd Recibe el producto seleccionado.
     * @return True
     */
    public boolean mostrarProducto(Producto[] prd) {
        JOptionPane.showMessageDialog(null, "Has seleccionado la bebida: " +prd[bot.getBebida()].getNombre());
        return true;
    }

    /**
     * Muestra el dinero que queda para llegar al precio del producto.
     *
     * @param prd Recibe el producto seleccionado
     * @return True
     */
    public boolean pedirDinero(Producto[] prd) {
        if (din.getCredito() < prd[bot.getBebida()].getPrecio()) {
            JOptionPane.showMessageDialog(null, "Te quedan: " + (prd[bot.getBebida()].getPrecio() - din.getCredito()) + "€");
        }
        return true;
    }

    /**
     * Muestra el dinero insertado
     *
     * @return True
     */
    public boolean mostrarDinero() {
        JOptionPane.showMessageDialog(null, "Dinero insertado: " + din.getCredito() + "€");
        return true;
    }
    
    
}
