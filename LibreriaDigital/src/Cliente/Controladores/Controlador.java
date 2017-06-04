/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controladores;

import Cliente.Cliente;
import Modelos.Lector;
import Modelos.Libro;
import Modelos.Admin; 
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Steven
 */
public class Controlador {
    
    Cliente cliente;

    public Controlador() {
        this.cliente = new Cliente();
        //cliente.start();
    }
    

    public ArrayList agregarLibro(Libro libro) {
        return cliente.realizarSolicitudServidor("agregarLibro", libro);
    }
    
    public ArrayList eliminarLibro(String isbn) {
        return cliente.realizarSolicitudServidor("eliminarLibro", isbn);
    }
    
    public ArrayList consultarLibro(String isbn){
        return cliente.realizarSolicitudServidor("consultarLibro", isbn);
    }
    
 //--------------------------------------- Metodos Lectores ------------------------------------
    
    public ArrayList agregarLector(Lector lector) {
        return cliente.realizarSolicitudServidor("agregarLector", lector);
    }
    
    public ArrayList eliminarLector(String correo) {
        return cliente.realizarSolicitudServidor("eliminarLector", correo);
    }
    
    public ArrayList consultarLector(String correo){
        return cliente.realizarSolicitudServidor("consultarLector", correo);
    }
    
 //--------------------------------------- Metodos Administrador ------------------------------------ 
    
    public ArrayList agregarAdministrador(Admin administrador) {
        return cliente.realizarSolicitudServidor("agregarAdministrador", administrador);
    }
    
    public ArrayList eliminarAdministrador(String correo) {
        return cliente.realizarSolicitudServidor("eliminarAdministrador", correo);
    }
    
    public ArrayList consultarAdministrador(String correo){
        return cliente.realizarSolicitudServidor("consultarAdministrador", correo);
    }
}
