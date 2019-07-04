/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.holamundojsf.beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Me
 */
@Named(value = "mensajeSaludo")
//@RequestScoped
@SessionScoped
public class MensajeSaludo implements Serializable{

    /**
     * Creates a new instance of MensajeSaludo
     */
    private String mensaje;
    private String nombre;
    
    public MensajeSaludo() {
    }
    
    public String saludo(){
        mensaje = "Hola " + nombre;
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
