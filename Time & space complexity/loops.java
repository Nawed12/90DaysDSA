public class loops {
    public static void main(String[] args) {
        int n=0;
        // Simple loop  ---- TC = O(n)
        for(int i=0;i<n;i++){
            System.out.println("COnstant work");
        }
        // Nested Loop1   ------>  TC= O(n^2)
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                // Constant work
            }
        }
        // Nested Loop2  -------> TC= O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                // Work 
            }
        }
        // Nest Loop3    ----------TC=O(n)
        int k=0;
        for(int i=0;i<n;i=i+k){    //-----n/k
            for(int j=i+1;j<k;j++){   //-----k
                //  Constant work   
            }
        }
    }
}
