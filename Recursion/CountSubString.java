public class CountSubString{
    public static int subStr(String str, int i, int j, int n){
        if( n==1 || n<=0 ){
            return n;
        }
     
     int res = subStr(str, i+1, j, n-1) + subStr(str, i, j-1, n-1) - subStr(str, i+1, j-1, n-2);

            if(str.charAt(i) == str.charAt(j)){
                res++;
            }   
         
            return res;
               
    }

    public static void main(String[] args){
        String str = "abcab";
        int n = str.length();
        System.out.print(subStr(str, 0, n-1, n));
    }
}