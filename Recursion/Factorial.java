
public class Factorial {
    public static int fact(int n){
        // BASE CASE
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
        
    }
}
