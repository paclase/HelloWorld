package Externo;

import Externo.Empleado;
import empresa.Jefe;
import empresa.Persona;

public class Empresa {

public static void main(String args[]){
    Jefe jefe = new Jefe("Pepe","Gotera","director"); //crea un objeto "jefe" se puede jefe1, jefe2...
    jefe.mostrar();
    jefe.cargo="subdirector";
    Empleado emp1 = new Empleado("Juan", "Martinez", "C/Real");
    emp1.mostrar();
    
    Persona persona = new Persona("Ana", "Ramirez");
    persona.mostrar();
} // main
}
