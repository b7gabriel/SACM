
package clinicamedicasolidarista.modelo.usuario;

import clinicamedicasolidarista.modelo.usuario.Usuario;
import java.util.Date;


public class Gestor extends UsuarioInterno {

    public Gestor(String cedula, String nombre, String apellidos, String usuario, String contrasena) {
        super(cedula, nombre, apellidos, usuario, contrasena);
    }

    public Gestor() {
        super();
    }
    
   
    
    
   

    @Override
    public String toString() {
        return super.toString()+"Gestor{" + "usuarioGestor=" + this.getUsuario() + ", contrasenaGestor=" + this.getContrasena() + '}';
    }
    
    
   
}
