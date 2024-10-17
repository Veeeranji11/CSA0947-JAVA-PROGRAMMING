import java.util.Scanner;
public class Diomond{
    public static void main(String[] args){
        int i,j,k,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the digit");
        n=scan.nextInt();
        for(i=0;i<=n;i++)
        {
            for(k=0;k<=n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=0;i--)
        {
            for(k=0;k<=n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
}