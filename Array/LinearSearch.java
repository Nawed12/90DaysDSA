public class LinearSearch {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,14,16,8,18};
        int key=8;
        int index=linearSearch(num, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key found at "+index);
        }
    }
    
}
