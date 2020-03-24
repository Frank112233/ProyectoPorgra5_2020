/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Franklin Fernandez
 */
@Named(value = "beanMantProductos")
@Dependent
public class beanMantProductos {

    private int producto_id;
    private String producto_descripcion;
    private int producto_estado;
    private float producto_precio;
    private int producto_cantidad;
    private String producto_nombre;
    private String producto_imagen;
    private String mensage;
    
    public beanMantProductos() {
    }
    
    public void limpiarProducto(){
        
    }
    
   public String validarDatos(){
        if (this.getProducto_id() <= 0) {
            this.setMensage("Producto id debe ser un numero mayor a 0");
            return "";
        }
        
        if (this.getProducto_descripcion().equals("")){
            this.setMensage("Descripcion es un campo requerido");
            return "";
        }
        
        if (this.getProducto_precio() == 0.00){
            this.setMensage("Telefono es un campo requerido");
            return "";
        }
        
        this.setMensage("Datos guardados correctamente.");
        return "";  
       
   }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getProducto_descripcion() {
        return producto_descripcion;
    }

    public void setProducto_descripcion(String producto_descripcion) {
        this.producto_descripcion = producto_descripcion;
    }

    public int getProducto_estado() {
        return producto_estado;
    }

    public void setProducto_estado(int producto_estado) {
        this.producto_estado = producto_estado;
    }

    public float getProducto_precio() {
        return producto_precio;
    }

    public void setProducto_precio(float producto_precio) {
        this.producto_precio = producto_precio;
    }

    public int getProducto_cantidad() {
        return producto_cantidad;
    }

    public void setProducto_cantidad(int producto_cantidad) {
        this.producto_cantidad = producto_cantidad;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getProducto_imagen() {
        return producto_imagen;
    }

    public void setProducto_imagen(String producto_imagen) {
        this.producto_imagen = producto_imagen;
    }
    
    
}
