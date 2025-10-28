public class Factorial{

    public static int fact(int n) {
        if(n==0){
            return 1;
        }
       int f = fact(n-1);  //first all call
       int ans = n*fact(n-1);  // than calculate
      return ans;
    }

    public static void main(String[] args){
         System.out.println(fact(5));



    }

}