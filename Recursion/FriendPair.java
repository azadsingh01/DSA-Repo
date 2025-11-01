public class FriendPair{
    public static int frndPair(int n){
        //choises
        if(n==1 || n==2){ 
            return n;
        }

         //kam
         //singlr pair
          int sp = frndPair(n-1);

          //double pair
          int dp = frndPair(n-2);
          int pairway = (n-1) * dp;

          int totalPair = sp + pairway;
          return totalPair; 

          // return frndPair(n-1) + (n-1) * FrendPair(n-2);
    }

    public static void main(String args[]){
       System.out.println(frndPair(3));
    }
}