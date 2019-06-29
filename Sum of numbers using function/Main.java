import java.util.Scanner;
class Main{
  	public static int sumn(int num)
	{
	    int sum = 0;
	    for(int i = 1; i<= num; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
    }
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=sumn(num);
      System.out.print(sum);
	    // Type your code here
	}
}