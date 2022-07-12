/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author user
 */
import java.util.Date;
public class Persona {
    private String nombre1;
    private String nombre2;
    private String Ci;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String celular;
    private String correo;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre1, String nombre2, String ci, String apellido1, String apellido2, String direccion, String celular, String correo, Date nacimiento) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.Ci = Ci;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.fechaNacimiento = nacimiento;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCi(String ci) {
        this.Ci = Ci;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public int calcularedad(){
        int edad = 23;
        
        return edad;
    }
    @Override
    public String toString() {
        return "los datos del obejeto son: \n"
                + "Cedula: "+getCi()+"\n"
                + "Apellido y Nombre: "+getapellido1()+ " "+getapellido2()+ "\n"
                +getnombre1()+" "+getnombre2()+"\n"
                        + "Direccion: "+getdireccion()+"\n"
                        + "celular:"+getcelular()+"\n"
                        + "Correo: "+getcorreo()+"\n"
                + "Edad: "+getcalcularedad();

                
              
    
        
        
    }

    private String getCi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getapellido2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getapellido1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getnombre1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getnombre2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getdireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcelular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcorreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcalcularedad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
}
