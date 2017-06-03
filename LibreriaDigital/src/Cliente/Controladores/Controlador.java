/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controladores;

import Cliente.Cliente;
import Modelos.Libro;
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
    }

     public ArrayList agregarLibro(Libro libro) {
        return cliente.realizarSolicitudServidor("agregarLibro", libro);
    }
}
