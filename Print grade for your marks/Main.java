import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      switch(n/5)
      {
       case 20:
        case 17:
          System.out.println("A");
        break;
        case 16:
        case 15:
          System.out.println("B");
        break;
        case 14:
        case 13:
          System.out.println("C");
        break;
        case 12:
        case 11:
          System.out.println("D");
        break;
        case 10:
        case 9:
          System.out.println("E");
          break;
        default:
        System.out.println("Fail");
        break;
      }
    }
}