/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author invitado
 */
public class Lector implements Serializable {

    private String nombre;
    private String apellidos;
    private String celular;
    private String fechaNacimiento;
    private String correo;
    private String password;
    private ArrayList preferencias;
    private int edad;
    private double saldo;
    private ArrayList consecutivo;
    private ArrayList fechaRecarga;
    private ArrayList horaRecarga;
    private ArrayList valorRecarga;
    private ArrayList misLibros;
    private int librosLeidos;

    public Lector(){
    }
    
    public Lector(String nombre, String apellidos, String celular, String fechaNacimiento, String correo, String password, ArrayList preferencias, int edad, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.password = password;
        this.preferencias = preferencias;
        this.edad = edad;
        this.saldo = saldo;
        this.librosLeidos = librosLeidos;
        consecutivo = new ArrayList();
        fechaRecarga = new ArrayList();
        horaRecarga = new ArrayList();
        valorRecarga = new ArrayList();
        misLibros = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getPreferencia() {
        return preferencias;
    }

    public void setPreferencia(ArrayList preferencias) {
        this.preferencias = preferencias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(ArrayList consecutivo) {
        this.consecutivo = consecutivo;
    }

    public ArrayList getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(ArrayList fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }

    public ArrayList getHoraRecarga() {
        return horaRecarga;
    }

    public void setHoraRecarga(ArrayList horaRecarga) {
        this.horaRecarga = horaRecarga;
    }

    public ArrayList getValorRecarga() {
        return valorRecarga;
    }

    public void setValorRecarga(ArrayList valorRecarga) {
        this.valorRecarga = valorRecarga;
    }

    public ArrayList getMisLibros() {
        return misLibros;
    }

    public void setMisLibros(ArrayList misLibros) {
        this.misLibros = misLibros;
    }

    public int getLibrosLeidos() {
        return librosLeidos;
    }

    public void setLibrosLeidos(int librosLeidos) {
        this.librosLeidos = librosLeidos;
    }

    public void recargarSaldo(double recarga) {
        this.saldo += recarga;
    }

    public String restarSaldo(double restaSaldo) {
        if (saldo < restaSaldo) {
            return "Saldo insuficiente\nFaltan $" + (restaSaldo - saldo) + " pesos";
        } else {
            saldo -= restaSaldo;
            return "saldo actual: $" + saldo + "pesos";
        }
    }
    
    public String toString(){
        return "Correo: "+ getCorreo() + " Nombre: "+ getNombre() + " Apellidos: "+ getApellidos(); 
    } 
}
