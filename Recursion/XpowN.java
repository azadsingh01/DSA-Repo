public class XpowN{
    public static int XpN(int x, int n){
       if(n == 0)
        return 1;
       
    
       return x * XpN(x, n-1);
       
    }
    public static void main(String[] args){
        int x = 2;
        int n = 10;
        System.out.println(XpN(x,n));
    }
}