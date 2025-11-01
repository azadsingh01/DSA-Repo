public class PrintBinary{
    public static void binaryStr(int n, int lastPlace, String str ){
    //base case
    if(n==0){
        System.out.println(str);
        return;
    }
   //kam
    binaryStr(n-1, 0, str+"0");
    if(lastPlace == 0){
        binaryStr(n-1, 1, str+"1");
    }
}

public static void main(String args[]){
    binaryStr(3, 0, "");
}
}