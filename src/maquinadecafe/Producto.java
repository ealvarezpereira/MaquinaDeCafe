/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecafe;

/**
 * Clase del objeto Producto que sólo contiene getters, setters y toString.
 * @author quique
 */
public class Producto {
    
    
    private Float precio;
    private String nombre;
    private static Integer azucar = 3;

    public Producto() {
    }

    public Producto(String nombre, float precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Integer getAzucar() {
        return azucar;
    }

    public static void setAzucar(Integer azucar) {
        Producto.azucar = azucar;
    }

    @Override
    public String toString() {
        return "Precio=" + precio + ", Nombre: " + nombre + ", Azucar: " + azucar;
    }
    
    
}
