package empresa;
public class Jefe extends Persona{
    public String cargo;
    public void mostrar(){
        System.out.println("Jefe.mostrar()");
        System.out.println("-------------------");
        super.mostrar(); // invocación al mostrar de la superclase Persona
        System.out.println("Cargo: " + cargo);
    } // mostrar
    public void setCargo(String cargo){
        this.cargo = cargo;
      
    } // setCargo
    public Jefe(String p_nombre, String p_apellido, String p_cargo){
        super(p_nombre, p_apellido); // esta forma sólo en constructores
        setCargo(p_cargo);
    } // constructor Jefe

} // clase Jefe