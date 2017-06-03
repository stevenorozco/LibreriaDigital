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
    
    private ObjectInputStream objectInput; // Recibi desde el cliente
    private ObjectOutputStream objectOutput; // Devuelve al cliente

    public Hilo(Socket socket_cliente) {
        this.socket_cliente = socket_cliente;
        this.biblioteca = new HashMap();
        
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

                default:
                    System.out.println("Mensaje desconocido");
                    break;
            }
        
    }
    
    
    public void agregarLibro(Libro libro) {
        if (biblioteca.containsKey(libro.getIsbn())) {
            try {
                ArrayList resp = new ArrayList();
                resp.add("El libro con ISBN: " + libro.getIsbn() + " ya existe en la biblioteca");
                objectOutput.writeObject(resp);
                objectOutput.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                biblioteca.put(libro.getIsbn(), libro);
                ArrayList resp = new ArrayList();
                resp.add("Libro agregado");
                objectOutput.writeObject(resp);
                objectOutput.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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


  
}

