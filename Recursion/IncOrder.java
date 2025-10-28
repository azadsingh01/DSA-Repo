public class IncOrder{

    public static void Inc(int n){
     if(n==1){
        System.out.print(n);
        return;
     }
        Inc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args){
        Inc(10);
    }
}