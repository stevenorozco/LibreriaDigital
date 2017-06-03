/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Configuraciones.ConfiguracionGlobal;
/**
 *
 * @author Steven
 */
public class Servidor extends Thread {
    private ServerSocket servidor; 
    private Socket socket_servidor; 
    
    public Servidor(){
        
        try{
            this.servidor = new ServerSocket(ConfiguracionGlobal.puerto); 
            System.out.println("Servidor desde puerto: " + ConfiguracionGlobal.puerto);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
   public void run(){
        try{
            while(true){
                System.out.println("Servidor creado\nEsperando Conexion");
                this.socket_servidor = servidor.accept();
                System.out.println("Conexion recibida de: " + socket_servidor.getInetAddress());
                
                Hilo hiloCliente = new Hilo(socket_servidor);
                hiloCliente.start();
                
            }
        }catch(Exception ioe){
            System.out.println("Error en la inicializacion del servidor");
        }
    }

    public String cerrarServidor(){
        String msg="Conexion del servidor detenida";
        try {
            this.socket_servidor.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            msg = "Error al cerrar la conexion del servidor";
        }
        return msg;
    }
    
    public static void main(String[] args) throws IOException
    {  
        
        Servidor servidor = new Servidor(); //Se crea el cliente
        servidor.start(); //Se inicia el cliente
    }
}
