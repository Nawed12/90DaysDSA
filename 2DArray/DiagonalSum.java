public class DiagonalSum {
    // METHOD 1: Brute Force
    public static int diagonal(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==n-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    // LINEAR METHOD
    public static int diagonal2(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            // Primary diagonal
            sum+=matrix[i][i];
        
        // Seconday diagonal
        if(i!=n-i-1){  //j=matrix,length-i-1
          sum+=matrix[i][n-1-i];
        }
    }

  return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        System.out.println(diagonal(matrix));
        System.out.println(diagonal2(matrix));
    }
}
