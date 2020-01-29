package guerraarray;
public class NaveNodriza {
    private Marciano[] marcianos;//Declaramos el array
    public NaveNodriza(int numMarcianos){
        marcianos=new Marciano[numMarcianos];
        for(int i=0;i<marcianos.length;i++){
            marcianos[i]=new ET();
        }
    }
    public void disparar(){
        for (int i=0;i<marcianos.length;i++){
            marcianos[i].disparar();
        }
    }
    public void mostrarInformacion(){
        for (int i=0;i<marcianos.length;i++){
            System.out.println("El ET "+marcianos[i].getIdentidad()+" ha disparado "+marcianos[i].obtenerDisparos()+" veces");
        }
    }
}
