/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Provincia;
import Model.ProvinciaDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author Franklin Fernandez
 */
@Named(value = "beanRegistroClientes")
@SessionScoped
public class beanRegistroClientes implements Serializable {
    //info cliente
    private String indentificacion;
    private String nombre;
    private String telefono;
    private String mensage;
    private String hora;
    private String primerApellido;
    private String segundoApellido;

    float cod_provincia;
    String dsc_corta_provincia;
    String dsc_provincia;
    float log_activo;
    LinkedList<SelectItem> listaPro = new LinkedList<>();

    public beanRegistroClientes() {
    }
    
    public String validarDatos(){
        if (this.getIndentificacion().equals("")) {
            this.setMensage("Identificacion es un campo requerido");
            return "";
        }
        
        if (this.getNombre().equals("")){
            this.setMensage("Nombre es un campo requerido");
            return "";
        }
        
        if (this.getTelefono().equals("")){
            this.setMensage("Telefono es un campo requerido");
            return "";
        }
        
        this.setMensage("Datos guardados correctamente.");
        return "";        
    }
    
    public void limpiarRegistroClientes(){
        this.setIndentificacion("");
        this.setNombre("");
        this.setTelefono("");
        this.setMensage("");
    }
    
    public LinkedList<SelectItem> getListaPro() 
            throws SNMPExceptions, SQLException{
        String dscCortaProvincia="";
        float codigoProvincia=0;
        
        LinkedList<Provincia> lista = new 
        LinkedList<Provincia>();
        ProvinciaDB pDB = new ProvinciaDB();
        
        //lista = pDB.moTodo();
        
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, 
                "Seleccione Provincia"));
        
        for (Iterator iter= lista.iterator();
                iter.hasNext();) {
        
            Provincia pro = (Provincia) iter.next();
            dscCortaProvincia=pro.getDsc_corta_provincia();
            codigoProvincia=pro.getCod_provincia();
            resultList.add(new SelectItem(codigoProvincia, 
                    dscCortaProvincia));
         }         
         return resultList; 
        
    }
            
    //sets y gets

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public float getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(float cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getDsc_corta_provincia() {
        return dsc_corta_provincia;
    }

    public void setDsc_corta_provincia(String dsc_corta_provincia) {
        this.dsc_corta_provincia = dsc_corta_provincia;
    }

    public String getDsc_provincia() {
        return dsc_provincia;
    }

    public void setDsc_provincia(String dsc_provincia) {
        this.dsc_provincia = dsc_provincia;
    }

    public float getLog_activo() {
        return log_activo;
    }

    public void setLog_activo(float log_activo) {
        this.log_activo = log_activo;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
}