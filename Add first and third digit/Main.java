import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      	Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int sum=(num1/100)+((num1%100)%10);
      System.out.println(sum);
	}
}