import java.util.Scanner;
public class Skipping{
    public static void main(String[] args){
        int m,n,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        m=scan.nextInt();
        System.out.println("enter the second number");
        n=scan.nextInt();
        for(i=m;i<=n;i+=5)
        {
             System.out.println(i);
            
        }
        }
}