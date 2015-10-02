

public class exercise5 {
    public static void main(String[] args){
       DataOnly data = new DataOnly();
        data.i = 1;
        data.d = 3.14;
        data.b = false;
        System.out.printf("i = %d;\nd = %f;\nb = %b", data.i, data.d, data.b); 
    }
}

class DataOnly{
    int i;
    double d;
    boolean b;
}
