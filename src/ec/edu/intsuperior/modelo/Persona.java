
package ec.edu.intsuperior.modelo;
import java.util.Date;

public class Persona {
    private String Ci;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String celular;
    private String correo;
    private Date   FechaNacimiento;

    public Persona() {
    }

    public Persona(String Ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String celular, String correo, Date FechaNacimiento) {
        this.Ci = Ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCi() {
        return Ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Los datos guardados son: \n"
                + "Cedula: "+getCi()+"\n"
                + "Apellidos y Nombres: "+getApellido1()+" "+getApellido2()+ 
                " "+getNombre1()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Cedular: "+getCelular()+"\n"
                + "Correo: "+getCorreo();
    }
   
    
}
