import java.util.Scanner;

// Count how many times lowercase vowels occurred in a String entered by the
// user.
public class CountLowerVowel {
    public static int lower(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lower(str));

    }
}
