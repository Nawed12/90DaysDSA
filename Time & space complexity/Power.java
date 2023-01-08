public class Power {
    // Power function 1  --------TC O(n)  SC O(n)
    public static int power1(int a,int n){
        if(n==0){
            return 1;
        }
        return a* power1(a, n-1);
    }
    // Power Function 2   ----------TC O(n)  SC= O(n)
    public static int power2(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq=power2(a, n/2)*power2(a, n/2);
        if(n%2!=0){
            return a*halfPowerSq;
        }
        return halfPowerSq;
    }
    // Power function 3 (Optimized)  ---------TC O(logn) SC=O(logn)
    public static int power3(int a,int n){
        if(n==0){
           return 1;
        }
        int halfpower=power3(a, n/2);
        int halfPowerSq=halfpower*halfpower;
        if(n%2!=0){
            return a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power1(2, 3));
        System.out.println(power2(2,4));
        System.out.println(power3(2, 3));
        
    }
}
