
package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;

public class Administrador extends UsuarioInterno {

    public Administrador(String cedula, String nombre, String apellidos,  String usuario,String contrasena) {
        super(cedula, nombre, apellidos, usuario, contrasena);
    }
 
      public Administrador() {
        super();        
    }
    
    @Override
    public String toString() {
        return super.toString()+"Administrador{" + "usuarioAdmin=" + this.getUsuario() + ", contrasenaAdmin=" + this.getContrasena() + '}';
    }
    
    
    
}
