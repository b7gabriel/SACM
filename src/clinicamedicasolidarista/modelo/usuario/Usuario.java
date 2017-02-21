package clinicamedicasolidarista.modelo.usuario;

import java.util.Date;


public class Usuario {
   private String cedula;
   private String nombre;
   private String apellidos;
//   private String correo_Electronico;
//   private String telefono;
//   private Date fecha_Nacimiento;
   
 public Usuario(String cedula, String nombre, String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
//        this.correo_Electronico = correo_Electronico;
//        this.telefono = telefono;
//        this.fecha_Nacimiento = fecha_Nacimiento;
    }
   
 public Usuario( ) {
        this.cedula = " ";
        this.nombre = " ";
        this.apellidos = " ";
//        this.correo_Electronico = " ";
//        this.telefono = " ";
//        this.fecha_Nacimiento = null ;
    }
 
 public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
//
//    public String getCorreo_Electronico() {
//        return correo_Electronico;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public Date getFecha_Nacimiento() {
//        return fecha_Nacimiento;
//    }

   

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

//    public void setCorreo_Electronico(String correo_Electronico) {
//        this.correo_Electronico = correo_Electronico;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
//        this.fecha_Nacimiento = fecha_Nacimiento;
//    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo_Electronico=" +  '}';
    }
     
    
}
