public class SortedArray {
    public static boolean sort(int i,int arr[]){
    //    BASE CASE
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return sort(i+1, arr);
    }
    public static void main(String[] args) {
        int arr[]={1,21,3,4};
        System.out.println(sort(0, arr));
    }
    
}
