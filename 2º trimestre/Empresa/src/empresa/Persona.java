package empresa;
public class Persona{
    protected String nombre; // se omite el acceso, por ahora
    String apellido;
    public void mostrar(){
        System.out.println("Persona: " + this.nombre + " " + this.apellido);
    } // mostrar
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido =apellido;
    } // constructor Persona
} // clase Persona
