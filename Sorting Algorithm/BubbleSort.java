public class BubbleSort {
    public static void bubbleSort(int arr[]){
        boolean swap;
        for(int i=0;i<=arr.length-2;i++){
            swap=false;
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    // SWAP
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;              
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int arr[]={1,3,4,5,2};
    bubbleSort(arr);
    print(arr);
   }
}
// TC = O(n^2)