/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;

/**
 *
 * @author Natalie
 */
public class Paciente_Asociado extends Paciente{
    
    public Paciente_Asociado(String cedula, String nombre, String apellidos) {
        super(cedula, nombre, apellidos);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
