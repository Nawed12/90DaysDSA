public class Pair {
    public static void pair(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                
                System.out.print("("+num[i]+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair "+tp);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pair(num);
    }
}
