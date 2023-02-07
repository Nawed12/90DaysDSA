public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[min]>arr[j]){
                    min=j;
                 }
            }
            // Swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int arr[]={22,14,43,49,50 };
    selectionSort(arr);
     print(arr);
  }  
}
// TC= O(n^2)