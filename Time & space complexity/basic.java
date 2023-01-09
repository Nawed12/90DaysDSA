import java.util.*;

public class basic {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float total = pen + pencil + eraser;
        // System.out.println("Total cost without GST: " + total);
        // float newTotal = total + (0.18f * total);

        // System.out.println("With GST " + newTotal);
        // float gst=newTotal-total;
        // System.out.println("Extra GST cost "+gst);

        // Reverse a number
        // int n = 2346539;
        // while (n > 0) {
        //     int l = n % 10;
        //     System.out.print(l + "");
        //     n = n / 10;
        // }
        // System.out.println();

        int n=12359;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println(rev);
    }
}
