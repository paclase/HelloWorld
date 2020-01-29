package externo;
import familia.*;
public class Familia {

    public static void main(String[] args) {
        Hijo hijo = new Hijo(7);
        Padre padre = new Padre(56);
        System.out.println("j: "+hijo.getj()+"  i: "+hijo.geti()+" Padre: "+padre.geti());
        hijo.change(15);
        System.out.println("j: "+hijo.getj()+"  i: "+hijo.geti());
    }
    
}
