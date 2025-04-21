package myprimerproyecto;

import modelo.Persona;

public class MyPrimerProyecto {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        persona.setApellido_paterno("Laura");
        persona.setApellido_materno("Quispe");
        persona.setCelular(987654321);

        
        String NombreCompleto = persona.getNombre() + " " + 
                                persona.getApellido_paterno() + " " + 
                                persona.getApellido_materno() + ", y el numero de celular es: " +
                                persona.getCelular();
        
        
        System.out.println("El nombre completo es: " + NombreCompleto);
        System.out.println("El nombre " + persona.getNombre());
        System.out.println("El Apellido paterno es: " + persona.getApellido_paterno());
        System.out.println("El Apellido materno es: " + persona.getApellido_materno());
        System.out.println("El celular es: " + persona.getCelular());
        
        
        //instanciar nuevamente al objeto Persona()
        
        
        //persona2
        Persona persona2 = new Persona();
        persona2.setNombre("tanos");
        persona2.setApellido_paterno("martin");
        persona2.setApellido_materno("vizcarra");
        persona2.setCelular(123456789);

        
        String NombreCompleto2 = persona2.getNombre() + " " + 
                                persona2.getApellido_paterno() + " " + 
                                persona2.getApellido_materno() + ", y el numero de celular es: " +
                                persona2.getCelular();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Persona 2");
        System.out.println("");
        System.out.println("");
        
        System.out.println("El nombre completo es: " + NombreCompleto2);
        System.out.println("El nombre " + persona2.getNombre());
        System.out.println("El Apellido paterno es: " + persona2.getApellido_paterno());
        System.out.println("El Apellido materno es: " + persona2.getApellido_materno());
        System.out.println("El celular es: " + persona2.getCelular());
        
        
    }
}
