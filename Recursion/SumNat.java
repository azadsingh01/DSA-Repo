public class SumNat{

    public static int fact(int n) {
        if(n==1){
            return 1;
        }
       int sumnm1 = fact(n-1);  //first all call
       int sum = n+fact(n-1);  // than calculate
      return sum;
    }

    public static void main(String[] args){
         System.out.println(fact(5));



    }
}
