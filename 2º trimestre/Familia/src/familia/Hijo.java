package familia;
public class Hijo extends Padre{
    private int j;
    public Hijo(int jj) {
        super(jj);
        j = jj;
    }
    public int getj(){
        return j;
    }
    public void change(int x) { set(x); } // metodo protegido del padre
}
