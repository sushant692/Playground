import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
          int rows = in.nextInt();
      int number = 1;
        for(int i = 1; i <= rows; i++) {
           for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
          
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }
            System.out.println();
        }
    }    
}