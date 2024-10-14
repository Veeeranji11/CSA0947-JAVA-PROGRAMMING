import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
        int i,j,n,s=1,r=s*s;
        char m;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=scan.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(r++);
            }
        System.out.println("");
        }
    }
}