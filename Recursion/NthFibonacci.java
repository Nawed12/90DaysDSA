public class NthFibonacci {
    public static int fibbonaci(int n){
        // BASE CASE
        if(n==0 || n==1){
            return n;
        }
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibbonaci(8));
    }
}
