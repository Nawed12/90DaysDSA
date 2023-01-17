public class PrintNos_Desord {
   public static void printDes(int n){
    // BASE CASE
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    System.out.print(n+" ");
    printDes(n-1);
   }
   public static void main(String[] args) {
    int n=20;
    printDes(n);
   }
}
