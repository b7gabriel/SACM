
package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;


public abstract class Paciente extends Usuario {
 
    public Paciente(String cedula, String nombre, String apellidos) {
        super(cedula, nombre, apellidos);
    }


   abstract public String toString();
        
    }
 
    
    
    

