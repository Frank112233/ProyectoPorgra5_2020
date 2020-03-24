/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author Franklin Fernandez
 */
@Named(value = "beanIngreso")
@SessionScoped
public class beanIngreso implements Serializable {

    private String usuario;
    private String contrasenna;
    private int role;
    private String mensaje;
    LinkedList<SelectItem> listaRoles = new LinkedList<>();

    public beanIngreso() {
    }

    public String validarDatos() {
        String pagina = "";
        if (this.getUsuario().equals("")) {
            setMensaje("Usuario es un campo requerido");
            return "";
        }

        if (this.getContrasenna().equals("")) {
            setMensaje("Contraseña es un campo requerido");
            return "";
        }

        if (this.getContrasenna().equals(this.getUsuario())) {
            setMensaje("");

            switch (this.getRole()) {
                case 1:
                    pagina = "Administrador.xhtml";
                    break;
                case 2:
                    pagina = "Despacho.xhtml";
                    break;
                case 3:
                    pagina = "Facturacion.xhtml";
                    //href="#{request.contextPath}//faces/consultaResultado.xhtml"
                    break;
                default:
                // code block
            }

            return pagina;
        } else {
            setMensaje("Usuario y contraseña no validos");
            return "";
        }
    }

    public void limpiarDatos() {
        this.setMensaje("");
        this.setContrasenna("");
        this.setUsuario("");
    }

    //sets y gets
    public LinkedList<SelectItem> getListaRoles() {
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(1, "Administrador"));
        resultList.add(new SelectItem(2, "Despacho"));
        resultList.add(new SelectItem(3, "Facturacion"));

        return resultList;
    }

    public void setListaRoles(LinkedList<SelectItem> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
