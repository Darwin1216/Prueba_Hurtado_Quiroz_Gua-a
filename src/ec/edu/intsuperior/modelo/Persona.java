/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class Persona {

    private String ci;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telefono, Date fechaNacimiento) {
        this.ci = ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int calcularEdad(Date fecha){
        int edad=0;
        
        System.out.println("Ingresa la fecha de nacimiento:");
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return edad;
    }

    @Override
    public String toString() {
        return "Datos son:\n"
                + "Cedula: "+getCi()+"\n"
                + "Apellidos y Nombres: "+getApellido1()+" "+getApellido2()+" "
                + ""+getNombre1()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
