/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Franklin Fernandez
 */
public class fproducto {
    
    private int producto_id;
    private String producto_nombre;
    private String producto_descripcion;
    private String producto_imagen;
    private int producto_estado;
    private float producto_precio;
    private int producto_cantidad;
    private int usuarioRegistra;
    private Date fecha_registrs;
    private int usuario_modifica;
    private Date fecha_modifica;

    public fproducto(int producto_id, String producto_nombre, String producto_descripcion, String producto_imagen, 
                    int producto_estado, float producto_precio, int producto_cantidad, int usuarioRegistra, 
                    Date fecha_registrs, int usuario_modifica, Date fecha_modifica) {
        this.producto_id = producto_id;
        this.producto_nombre = producto_nombre;
        this.producto_descripcion = producto_descripcion;
        this.producto_imagen = producto_imagen;
        this.producto_estado = producto_estado;
        this.producto_precio = producto_precio;
        this.producto_cantidad = producto_cantidad;
        this.usuarioRegistra = usuarioRegistra;
        this.fecha_registrs = fecha_registrs;
        this.usuario_modifica = usuario_modifica;
        this.fecha_modifica = fecha_modifica;
    }
    

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getProducto_descripcion() {
        return producto_descripcion;
    }

    public void setProducto_descripcion(String producto_descripcion) {
        this.producto_descripcion = producto_descripcion;
    }

    public String getProducto_imagen() {
        return producto_imagen;
    }

    public void setProducto_imagen(String producto_imagen) {
        this.producto_imagen = producto_imagen;
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

    public int getUsuarioRegistra() {
        return usuarioRegistra;
    }

    public void setUsuarioRegistra(int usuarioRegistra) {
        this.usuarioRegistra = usuarioRegistra;
    }

    public Date getFecha_registrs() {
        return fecha_registrs;
    }

    public void setFecha_registrs(Date fecha_registrs) {
        this.fecha_registrs = fecha_registrs;
    }

    public int getUsuario_modifica() {
        return usuario_modifica;
    }

    public void setUsuario_modifica(int usuario_modifica) {
        this.usuario_modifica = usuario_modifica;
    }

    public Date getFecha_modifica() {
        return fecha_modifica;
    }

    public void setFecha_modifica(Date fecha_modifica) {
        this.fecha_modifica = fecha_modifica;
    }
    
    
    
    
}
