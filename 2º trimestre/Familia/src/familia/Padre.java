package familia;
public class Padre{
    private int i;
    protected int read() { 
        return i; 
    }
    protected void set(int ii){ 
        i = ii; 
    }
    public Padre(int ii) { 
        i = ii; 
    }
    public int value(int m) { 
        return m*i; 
    }
    public int geti(){
        return i;
    }
}// clase Padre
