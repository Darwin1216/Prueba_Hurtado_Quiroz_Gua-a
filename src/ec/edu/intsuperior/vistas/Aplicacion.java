

package ec.edu.intsuperior.vistas;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("Ingrese la cedula");
        p1.setCi(leer.next());
        System.out.println("Ingresa nombre1");
        p1.setNombre1(leer.next());
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        JOptionPane.showMessageDialog(null,p1.toString());

        }
    }
            
    
    

