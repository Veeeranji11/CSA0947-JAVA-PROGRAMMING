import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        int i,j,k,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n=scan.nextInt();
        for(i=0;i<=n;i++)
        {
            for(k=0;k<=n-i;k++)
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