package ec.edu.intsuperior.vistas;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        p1.setCi(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese su primer nombre"));
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa su segundo nombre"));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        p1.setApellido2(JOptionPane.showInputDialog("Ingresa el apellido materno"));
        p1.setDireccion(JOptionPane.showInputDialog("Ingresa su direccion"));
        p1.setCelular(JOptionPane.showInputDialog("Ingrese su numero celular"));
        p1.setCorreo(JOptionPane.showInputDialog("Ingrese su correo"));
       
       
        JOptionPane.showMessageDialog(null, p1.toString());
    }
            
    
    
}
