public class TilingPro{
    public static int tiling(int n){
        //base case
        if(n == 0 || n==1){
            return 1;
        }

        // vertical
        int fnm1 = tiling(n-1);

        //horizontal
        int fnm2 = tiling(n-2);
        int totWay = fnm1 + fnm2;
        return totWay;
    } 
    public static void main(String[] args){
    int n = 5;
    System.out.println(tiling(n));
    }
}