

package ec.edu.intsuperior.vistas;

import ec.edu.intsuperior.modelo.Estudiante;
import ec.edu.intsuperior.modelo.Persona;


public class Aplicacion {
    public static void main(String[] args) {
        Estudiante e=new Estudiante();
        Persona p=new Estudiante();
        e.setNumMatricula("M-001");
      
        
        e.setApellido1("solis");
        System.out.println(e.toString());
    }
            
    
    
}
