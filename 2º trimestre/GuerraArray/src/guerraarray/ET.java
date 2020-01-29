
package guerraarray;


public class ET extends Marciano{
    
    public ET() {
        super(5);
    }
    
    public void disparar(){
        for (int i=0;i<disparos.length;i++){
           int x=(int)(Math.random()*10 + 1); 
            disparos[i]+=x;

        }
}
}