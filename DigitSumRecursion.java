package Recursion;

public class DigitSumRecursion {
static int sum=0;
  static void  returndigitsum(int num) {
    if(num==0){
        return ;
    }
   int lastdigit = num%10;
   sum += lastdigit;
   returndigitsum(num/10);
  }

  public static void main(String[] args) {
    returndigitsum(123);
    System.out.println(sum);
  }
}
