/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista.modelo.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Administrador
 */
public class RegistroUsuarios extends Observable {

    Hashtable<String,String> errores;
    String mensaje;
    
    public RegistroUsuarios() {
        this.usuarios = new ArrayList<Usuario>();
        agregarDatos();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void agregarUsuario(Usuario usuario) {
        if(buscarUsuario(usuario.getCedula())==null){
        usuarios.add(usuario);
         setChanged();
         notifyObservers(AGREGADO);
        }
        else{
        setChanged();
        notifyObservers(EXISTE);
        }
    }
    public Usuario getAutenticar(String id, String pass){
    for(int i = 0; i<usuarios.size();i++){
        UsuarioInterno u= (UsuarioInterno) usuarios.get(i);
        if(u.getUsuario().equals(id)&&u.getContrasena().equals(pass))
       
            return u;
    }
   
    return null;
    }
    public void logueado(Usuario u){
    login=u;
     setChanged();
     notifyObservers(VENTANALOGIN);
    }
     @Override
    public void addObserver(Observer o){//agrega los observer al vector del observable 
    super.addObserver(o);
    setChanged();
    //notifyObservers(this);//invoca los update de las  ventanas 
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }
    public Usuario buscarUsuario(String userName){
    for(int i = 0; i<usuarios.size();i++){
        UsuarioInterno u= (UsuarioInterno) usuarios.get(i);
        if(u.getUsuario().equals(userName))
            return u;
    }
    return null;
    }
    public boolean cambiarContrasena(String user,String codigo,String pass){
       if(CODIGO_SEGURIDAD.equals(codigo)){
        Usuario u = buscarUsuario(user);
        if(u!=null){
        cambiarPass(u,pass);
        //((UsuarioInterno)login).setContrasena(pass);
        return true;
        }
       }
       return false;
    }
    public void cambiarPass(Usuario u,String pass){
    ((UsuarioInterno)u).setContrasena(pass);
   //  setChanged();
    // notifyObservers(CAMBIAR);
    }
     public void agregarDatos(){
    usuarios.add(new Administrador("1","Kennett", "Vega Vargas", 
           "Admin123", DigestUtils.shaHex("1")));
    usuarios.add(new Gestor("1","Nathalie", "Vega Vargas", 
            "Gestor123", DigestUtils.shaHex("test@A123/")));
    }
     
         public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Hashtable<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Hashtable<String, String> errores) {
        this.errores = errores;
    }
    
    public void clearErrors(){
        setErrores(new Hashtable<String,String>());
        setMensaje("");
        
    }
    
    private ArrayList<Usuario> usuarios;
    private static Usuario login= null;
    static String CAMBIAR="cambiar";
    static String CODIGO_SEGURIDAD="XYZ";
    static String EXISTE="EXISTE";
    static String AGREGADO="AGREGADO";
    static String VENTANALOGIN = "LOGIN";
    static String VENTANAADMIN = "ADMIN";
    static String VENTANAGESTOR = "GESTOR";
}

