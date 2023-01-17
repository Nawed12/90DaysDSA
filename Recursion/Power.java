public class Power {
    // First method
    public static int power(int n,int x){
        if(n==0){
            return 1;
        }
        return x* power(n-1,x);
    }
    // Optimized method 
    public static int optimized(int n,int a){
        if(n==0){
            return 1;
        }
        int half=optimized(n/2, a) * optimized(n/2, a);
        //For odd
        if(n%2!=0){
            half=a*half;
        }
        return half;
    }
    public static void main(String[] args) {
        // System.out.println(power(3, 2));
        System.out.println(optimized(3, 2));
    }
}
