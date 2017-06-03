/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Configuraciones.ConfiguracionGlobal;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author Steven
 */
public class Cliente extends Thread{
    Socket socket_cliente; 
    ObjectOutputStream objectOutput; 
    ObjectInputStream objectInput; 
    String host; 
    int puerto; 
    
    public Cliente(){
        host = ConfiguracionGlobal.host;
        puerto = ConfiguracionGlobal.puerto;
        start();
    }
    
    public void run(){
        conectarServidor(); 
    }
    
    public void conectarServidor(){
        
        try{
            System.out.println("Inicializando conexión a servidor...");
            socket_cliente = new Socket(host,puerto);
            
            System.out.println("Flujos creados");
            objectOutput = new ObjectOutputStream(socket_cliente.getOutputStream());
            objectInput = new ObjectInputStream(socket_cliente.getInputStream());
            
            System.out.println("Conexión establecida con servidor");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public ArrayList realizarSolicitudServidor(String serviceName, Object object){
        String mensaje = "";
        ArrayList response = null; 
        try{
            //Se crea la solicitud
            ArrayList request = new ArrayList(); 
            request.add(serviceName); 
            request.add(object); 
            
            //Se envia solicitud al servidor
            objectOutput.writeObject(request);
            objectOutput.flush();
            
            //Se captura la respuesta del servidor
             response = (ArrayList)objectInput.readObject();
                          
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return response; 
    }
}
