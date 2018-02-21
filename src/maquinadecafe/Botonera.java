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
public class Botonera {

    private static int bebida;

    /**
     * Menú para que el usuario seleccione la bebida que desee
     * @return true
     * 
     */
    public boolean seleccionarProducto() {
        String[] productos = {"Café", "Chocolate", "Té"};
        bebida = JOptionPane.showOptionDialog(null, "Seleccione bebida", "Cafetera", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, productos, null);
        return true;
    }

    /**
     * Getter para retornar la bebida que selecciona el usuario
     * @return int bebida
     */
    
    public int getBebida() {

        return bebida;
    }

    /**
     * Añade mas azucar
     *
     * @return True
     */
    public boolean masAzucar() {
        if (Producto.getAzucar() >= 0 && Producto.getAzucar() < 5) {
            Producto.setAzucar(Producto.getAzucar() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "No puedes añadir más azucar");
        }

        return true;
    }

    /**
     * Quita azucar
     *
     * @return True
     */
    public boolean menosAzucar() {
        if (Producto.getAzucar() <= 5 && Producto.getAzucar() > 0) {
            Producto.setAzucar(Producto.getAzucar() - 1);
        } else {
            JOptionPane.showMessageDialog(null, "No puedes quitar más azucar");
        }
        return true;
    }

}
