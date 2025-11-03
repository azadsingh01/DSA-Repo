public class NumberToStr{
    static String digit[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void NoToStr(int number){

  if(number == 0){
    return;
  }
  int lastDigit = number%10;
  System.out.print(digit[lastDigit]+" ");
  NoToStr(number/10);
}

    public static void main(String[] args){
        int year = 2020;
        NoToStr(year);
    }
}