import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n,l;
      for (int i = num; i >0; i--) 
        { 
        l=num;
            for (int j = 0; j<i; j++)
            {
                System.out.print(l);
             l--;
            }
             num--;
            System.out.print("\n");
        }
         
	}
}