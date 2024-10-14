import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
        int i,j,n,s=1;
        char m;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(s*s);
                s++;
            }
        System.out.println("");
        }
    }
}