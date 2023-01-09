public class LargestNo {
    // Largest element in an array 
    public static int largest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    // Smallest Element in an array 
    public static int smallest(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[]={23,45,67,86,97};
        System.out.println(largest(num));
        System.out.println(smallest(num));
    }
}
