
public class PrintNos_IncOrd {
    public static void printInc(int n){
        // BASE case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printInc(10);
    }
}
