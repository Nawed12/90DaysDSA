public class MaxSubarray {
    // Brute force  ----------- TC O(n^3) 
        public static void maxsubarray1(int num[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += num[k];
                }
                System.out.print(currentsum + " ");
            
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Max sum " + maxsum);
    }
    // KADANE'S Algorithm
    public static void kadane(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("max sum is :"+ms);
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, -3 };
        // maxsubarray1(num);
        kadane(num);
    }

}
