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
public class MaquinaDeCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dinero din = new Dinero();
        Botonera bot = new Botonera();
        Display dis = new Display();
        Producto prod[] = {new Producto("Café", 0.5f), new Producto("Chocolate", 0.6f), new Producto("Té", 0.5f)};

        boolean on = true;

        while (on == true) {

            String[] menu = {"Insertar moneda", "Seleccionar bebida", "Más azucar", "Menos azucar", "Devolver Dinero", "Salir"};

            Integer op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Cafetera", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, menu, null);

            switch (op) {

                case 0:
                    din.introducirDinero();

                    while (din.getCredito() < prod[bot.getBebida()].getPrecio()) {

                        dis.pedirDinero(prod);
                        din.introducirDinero();
                    }

                    dis.mostrarDinero();
                    din.devolverCambio(prod);
                    break;

                case 1:
                    bot.seleccionarProducto();
                    dis.mostrarProducto(prod);
                    break;
                case 2:
                    bot.masAzucar();
                    dis.mostrarAzucar();
                    break;
                case 3:
                    bot.menosAzucar();
                    dis.mostrarAzucar();
                    break;
                case 4:
                    din.devolverDinero();
                    break;
                case 5:
                    on = false;
                    break;

            }
        }
    }

}
