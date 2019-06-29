import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    	Scanner in=new Scanner(System.in);
    int n1,n2,n3;  
    int num1=in.nextInt();
      n1=num1/100;
    n2=(num1/10)%10;
    n3=num1%10;
    int rev=n3*100+n2*10+n1;
    System.out.println(rev);
  }
}