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
public class Dinero {

    private static Float credito = 0f;
    Botonera bot = new Botonera();

    /**
     * Permite introducir dinero y su valor lo suma a la variable credito
     *
     * @return True
     */
    public boolean introducirDinero() {
        credito = Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero"));
        return true;
    }

    /**
     * Devuelve el dinero introducido
     *
     * @return true
     */
    public boolean devolverDinero() {
        JOptionPane.showMessageDialog(null, "Dinero soltado correctamente.");
        credito = 0F;
        return true;
    }

    /**
     * Devuelve al usuario el cambio del producto seleccionado.
     *
     * @param seleccion Recibe el producto seleccionado por el usuario.
     * @return True
     */
    public boolean devolverCambio(Producto[] seleccion) {
        JOptionPane.showMessageDialog(null, "Vuelta: " + (credito - seleccion[bot.getBebida()].getPrecio()));
        credito = 0f;
        return true;

    }

    /**
     * getter y setter para recibir e introducir el dinero que metes.
     *
     * @return credito
     */
    public float getCredito() {
        return credito;
    }

    public void setCredito(float cred) {

        credito = cred;
    }

}
