import java.util.Scanner;
class Main
{
  	public static int square(int num)
	{
	    int sq=num*num;
	    return sq;
    }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sq=square(num);
      System.out.print(sq);
	 // Type your code here   
	} 
}