package Externo;

import empresa.Persona;

public class Empleado extends Persona{
    private String direccion;
    public void mostrar(){
        // Invocamos al método de la superclase
        System.out.println("Empleado.mostrar()");
        System.out.println("-------------------");
        super.mostrar(); // invocación al mostrar de la superclase Persona
        System.out.println("Nombre:" +nombre+"Dirección: " + direccion);
        
    } // mostrar
    public void setDireccion(String direccion){
        this.direccion=direccion;
    } // setDireccion
    public Empleado(String p_nombre, String p_apellido, String p_direccion){
        super(p_nombre, p_apellido); // esta forma sólo en constructores
        setDireccion(p_direccion);
    } // Empleado

} // clase Empleado
