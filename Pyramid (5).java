import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
        int i,j,n;
        char m;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=scan.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(i*i);
            }
        System.out.println("");
        }
    }
}