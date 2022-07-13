/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Santiago Solis
 */
public class Estudiante extends Persona{
   String numMatricula;

    public Estudiante() {
    }

    public Estudiante(String numMatricula, String ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telefono, Date fechaNacimiento) {
        super(ci, nombre1, nombre2, apellido1, apellido2, direccion, telefono, fechaNacimiento);
        this.numMatricula = numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return super.toString()+" \n"
                + "Numero Matricula: "+getNumMatricula(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
    
    
}
