
package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;


public class Paciente_Externo extends Paciente {
    
    public Paciente_Externo(String cedula, String nombre, String apellidos) {
        super(cedula, nombre, apellidos);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
