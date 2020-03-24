/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ivonn
 */
public class Producto {
 //variables
    
    private int prod_id;
    private String nombreProducto;
    private double cantidad;
    private char estado;
    private double precio;
    
    /*private String direccion;*/
    
    //Constructores
    
    public Producto(int codigo, String nombre, double cantidad, char estado, double precio){
        this.setNombreProducto(nombre);
        this.setProd_id(codigo);
        this.setEstado(estado);
        this.setCantidad(cantidad);
        this.setPrecio(precio);
    }
    
    public Producto()   {
        
    }
    //SET Y GET

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double codigo) {
        this.cantidad = codigo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}//fin clase
