public class recursion {
    // FACTORIAL   ------- TC= O(n)   SC=O(n)
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n* fact(n-1);
    }
    // SUM of n    --------TC O(n)   SC= O(n)
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    // Fibonnaci   ------------- TC O(2^n)  SC= 0(n)
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fact(4 ));
        System.out.println(sum(4));
        System.out.println(fib(7));
    }
}
