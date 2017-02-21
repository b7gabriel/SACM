/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista.controlador;

import clinicamedicasolidarista.modelo.usuario.RegistroUsuarios;
import clinicamedicasolidarista.modelo.usuario.Usuario;
import java.util.Observer;

/**
 *
 * @author Administrador
 */
public class Controlador {
   public RegistroUsuarios modeloRegistroUsuarios;

    public Controlador(RegistroUsuarios modeloRegistroUsuarios) {
        this.modeloRegistroUsuarios = modeloRegistroUsuarios;
    }
    public Controlador() {
        this.modeloRegistroUsuarios = new RegistroUsuarios();
    }
    public void agregarUsuario(Usuario usuario) {
        modeloRegistroUsuarios.agregarUsuario(usuario);
    }
    public Usuario getAutenticar(String id, String pass){
        return modeloRegistroUsuarios.getAutenticar(id, pass);
    }
   
    public void registrarObservador(Observer v){
    modeloRegistroUsuarios.addObserver(v);
    }
    public void logueado(Usuario u){
    this.modeloRegistroUsuarios.logueado(u);
    }
    public boolean cambiarContrasena(String user,String codigo,String pass){
    return modeloRegistroUsuarios.cambiarContrasena(user,codigo, pass);
    }
   

}
