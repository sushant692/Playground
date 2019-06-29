import java.io.*;
class Main {
     public static void main(String[] args) throws IOException {
          int num,i,f,r,sum=0,temp;
          BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
          num=Integer.parseInt(br.readLine());
          temp=num;

          while(num!=0){
              i=1;f=1;
              r=num%10;

              while(i<=r){
                   f=f*i;
                   i++;
              }

              sum=sum+f;
              num=num/10;
          }

          if(sum==temp)
              System.out.println("Yes");
          else
              System.out.println("No");
     }
}