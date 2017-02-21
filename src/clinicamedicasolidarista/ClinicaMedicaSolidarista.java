/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista;

import clinicamedicasolidarista.controlador.Controlador;
import clinicamedicasolidarista.modelo.usuario.RegistroUsuarios;

import clinicamedicasolidarista.vista.Menu;
import clinicamedicasolidarista.vista.MenuDoctores;
import clinicamedicasolidarista.vista.MenuParametrizacion;
import clinicamedicasolidarista.vista.vistaAgenda;
import clinicamedicasolidarista.vista.vistaKardex;
import clinicamedicasolidarista.vista.vistaLogin;

import clinicamedicasolidarista.vista.vistaRegistroAdministrador1;
import clinicamedicasolidarista.vista.vistaRegistroGestor;
import clinicamedicasolidarista.vista.vistaRegistroMedico;
import clinicamedicasolidarista.vista.vistaSolicitudCita;

/**
 *
 * @author Administrador
 */
public class ClinicaMedicaSolidarista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte del Login
        RegistroUsuarios usuarios=new RegistroUsuarios();
         Controlador controlLogin
                = new Controlador(usuarios);
        vistaLogin login
                = new vistaLogin(controlLogin);
        LOGIN=login;
        LOGIN.setVisible(true);
        
        ADMINISTRADOR.setControl(controlLogin);
        Gestor.setControl(controlLogin);
    }
    public static vistaLogin LOGIN;
    public static Menu MENU = new Menu();
    public static vistaSolicitudCita VISTACITA=new vistaSolicitudCita();
    public static vistaRegistroAdministrador1 ADMINISTRADOR = new vistaRegistroAdministrador1();
    public static vistaRegistroGestor Gestor = new vistaRegistroGestor();
    public static vistaSolicitudCita CITA=new vistaSolicitudCita();
    public static MenuParametrizacion PARAMETRIZACION = new MenuParametrizacion();
    public static MenuDoctores DOC  = new MenuDoctores();
    public static vistaRegistroMedico MEDICOS = new vistaRegistroMedico();
    public static vistaKardex KARDEX = new vistaKardex();
    public static vistaAgenda AGENDA = new vistaAgenda();
    
}


 