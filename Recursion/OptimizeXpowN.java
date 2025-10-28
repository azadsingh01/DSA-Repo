public class OptimizeXpowN{
    public static int Power(int x, int n){
     if(n==0)
     return 1;

    // int halfpowsq = Power(x, n/2) * Power(x, n/2);

    int halfpow = Power(x, n/2);
     int halfpowsq = halfpow * halfpow;

     // if n is odd
     if(n % 2 != 0){
        halfpowsq = x * halfpowsq;
     }

     return halfpowsq;
    }
    public static void main(String[] args){
        int x=2;
        int n=10;
        System.out.println(Power(x,n));
    }
}