/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Modelos.*; 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.ArrayList;


public class Hilo extends Thread {

    private Socket socket_cliente;
    private HashMap biblioteca;
    private HashMap lectores; 
    private HashMap administradores; 
    
    private ObjectInputStream objectInput; // Recibi desde el cliente
    private ObjectOutputStream objectOutput; // Devuelve al cliente

    public Hilo(Socket socket_cliente) {
        this.socket_cliente = socket_cliente;
        this.biblioteca = new HashMap();
        this.lectores = new HashMap(); 
        this.administradores = new HashMap(); 
        
        try {
            objectInput = new ObjectInputStream(socket_cliente.getInputStream());
            objectOutput = new ObjectOutputStream(socket_cliente.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public synchronized void run() {
        
            while (true) {
                System.out.println("Thread running");
                try {
                    recibirSolicitudCliente((ArrayList) objectInput.readObject());
                }catch(Exception ex){}
            }
    }
    
    public void recibirSolicitudCliente(ArrayList request){

            switch ((String) request.get(0)) {
                case "agregarLibro":
                    agregarLibro((Libro) request.get(1));
                    guardarBiblioteca();
                    break;
                    
                case "eliminarLibro":
                    eliminarLibro((String) request.get(1));
                    guardarBiblioteca();
                    break;
                    
                case "consultarLibro":
                    consultarLibro((String) request.get(1));
                    break;
                    
          
                case "agregarLector":
                    agregarLector((Lector) request.get(1));
                    guardarLectores();
                    break;
                    
                case "eliminarLector":
                    eliminarLector((String) request.get(1));
                    guardarLectores();
                    break;
                    
                case "consultarLector":
                    consultarLector((String) request.get(1));
                    break;
                    
                case "agregarAdministrador":
                    agregarAdministrador((Admin) request.get(1));
                    guardarAdministradores();
                    break;
                    
                case "eliminarAdministrador":
                    eliminarAdministrador((String) request.get(1));
                    guardarAdministradores();
                    break;
                    
                case "consultarAdministrador":
                    consultarAdministrador((String) request.get(1));
                    break;

                default:
                    System.out.println("Mensaje desconocido");
                    break;
                    
            }
        
    }
    
    
    public void agregarLibro(Libro libro) {
        
        try{
            ArrayList response = new ArrayList();
            if (biblioteca.containsKey(libro.getIsbn()))
                response.add("El libro con ISBN: " + libro.getIsbn() + " ya existe en la biblioteca");
            else{
                biblioteca.put(libro.getIsbn(), libro);
                response.add("Libro " + libro.getIsbn() +" agregado");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    
    public void eliminarLibro(String isbn) {
        
            try{
            ArrayList response = new ArrayList();
            if (biblioteca.containsKey(isbn) == false)
                response.add("El libro con ISBN: " + isbn + " no existe en la biblioteca");
            else{
                biblioteca.remove(isbn);
                response.add("Libro " + isbn +" se ha eliminado");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public void consultarLibro(String isbn) {
        Libro libro = (Libro) biblioteca.get(isbn);
        try{
            ArrayList response = new ArrayList();
            if (libro == null){
                response.add("El libro con ISBN: " + isbn + " no existe en la biblioteca");
                response.add(null);
            }
            else{
                response.add("Libro encontrado");
                response.add(libro);
            }
            
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public void guardarBiblioteca() {
        ObjectOutputStream escritor;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("biblioteca.txt", false));
            escritor.writeObject(this.biblioteca);
            escritor.flush();
            escritor.close();
            System.out.println("Biblioteca guardada");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    //--------------------------------------- Metodos Lectores ------------------------------------
    
    public void agregarLector(Lector lector) {
        
        try{
            ArrayList response = new ArrayList();
            if (lectores.containsKey(lector.getCorreo()))
                response.add("El correo " + lector.getCorreo() + " ya se encuentra registrado");
            else{
                lectores.put(lector.getCorreo(), lector);
                response.add("Se agrego el lector con correo " + lector.getCorreo() + " exitosamente");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    
    public void eliminarLector(String correo) {
        
            try{
            ArrayList response = new ArrayList();
            if (lectores.containsKey(correo) == false)
                response.add("El ususario con el correo: " + correo + " no existe en la biblioteca");
            else{
                lectores.remove(correo);
                response.add("Libro " + correo +" se ha eliminado");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void consultarLector(String correo) {
        Lector lector = (Lector) lectores.get(correo);
        try{
            ArrayList response = new ArrayList();
            if (lector == null){
                response.add("El ususario con el correo: " + correo + " no existe en la biblioteca");
                response.add(null);
            }
            else{
                response.add("Usuario lector encontrado");
                response.add(lector);
            }
            
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public void guardarLectores() {
        ObjectOutputStream escritor;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("lectores.txt", false));
            escritor.writeObject(this.lectores);
            escritor.flush();
            escritor.close();
            System.out.println("Lectores guardada");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    //--------------------------------------- Metodos Administrador ------------------------------------ 
    
    public void agregarAdministrador(Admin administrador) {
        
        try{
            ArrayList response = new ArrayList();
            if (administradores.containsKey(administrador.getCorreo()))
                response.add("El correo " + administrador.getCorreo() + " ya se encuentra registrado");
            else{
                administradores.put(administrador.getCorreo(), administrador);
                response.add("Se agrego el administrador con correo " + administrador.getCorreo() + "exitosamente");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    
    public void eliminarAdministrador(String correo) {
        
            try{
            ArrayList response = new ArrayList();
            if (administradores.containsKey(correo) == false)
                response.add("El ususario con el correo: " + correo + " no existe en la biblioteca");
            else{
                administradores.remove(correo);
                response.add("Libro " + correo +" se ha eliminado");
            }
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void consultarAdministrador(String correo) {
        Admin administrador = (Admin) administradores.get(correo);
        try{
            ArrayList response = new ArrayList();
            if (administrador == null){
                response.add("El ususario con el correo: " + correo + " no existe en la biblioteca");
                response.add(null);
            }
            else{
                response.add("Usuario administrador encontrado");
                response.add(administrador);
            }
            
            //Enviamos respuesta al cliente
            objectOutput.writeObject(response);
            objectOutput.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public void guardarAdministradores() {
        ObjectOutputStream escritor;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("administradores.txt", false));
            escritor.writeObject(this.administradores);
            escritor.flush();
            escritor.close();
            System.out.println("Administradores guardada");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


  
}

