public class ShortestPath {
    public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char div=path.charAt(i);
            if(div=='S'){
                y--;
            }
            else if(div=='N'){
                y++;
            }else if(div=='E'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestpath(path));
    }
}
