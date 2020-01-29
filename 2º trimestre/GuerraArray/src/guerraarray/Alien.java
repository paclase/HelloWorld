
package guerraarray;

/**
 *
 * @author Alumno
 */
public class Alien extends Marciano{

    public Alien() {
        super(100);
    }
    
        public void disparar(){
        for (int i=0;i<disparos.length;i++){
            disparos[i]+=(int)(Math.random()*5 + 1);
        }
        
       }
}


