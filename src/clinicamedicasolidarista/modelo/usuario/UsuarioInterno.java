/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;

/**
 *
 * @author KENNETT
 */
public class UsuarioInterno extends Usuario {

    public UsuarioInterno(String cedula, String nombre, String apellidos,String usuario, 
            String contrasena) {
        super(cedula, nombre, apellidos);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public UsuarioInterno() {
        super();
        this.usuario = "";
        this.contrasena = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    private String usuario;
    private String contrasena; 
}
