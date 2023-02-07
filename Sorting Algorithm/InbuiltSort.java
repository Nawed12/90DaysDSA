import java.util.Arrays;
public class InbuiltSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,4,1};
        Arrays.sort(arr);
        print(arr);

    }
}
