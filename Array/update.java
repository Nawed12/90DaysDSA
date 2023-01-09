

public class update {
    public static void increase(int marks[],int nonchangeable){
        nonchangeable=9;
      for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
      }
    }
    public static void main(String[] args) {
        int marks[]={99,89,79};
        int nonchangeable=6;
        increase(marks,nonchangeable);
        System.out.println(marks.length);
        System.out.println(nonchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
