
public class Exercise4 {
    public static void main(String[] args){
        int N = 100;
        boolean b = false;
        for (int i = 3; i < N; i++){
            b = false;
            for (int j = 2; j <= Math.sqrt(i) + 1; j++){
              //  System.out.println(i + " : " + j);
                if (i % j == 0){
                    b = true;
                    break;
                }
            }
            if (b == false)
                System.out.println(i + "is prime.");
        }
    }
}
