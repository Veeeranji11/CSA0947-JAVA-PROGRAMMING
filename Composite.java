import java.util.Scanner;
public class Composite{
    public static void main(String[] args){
        int m,n,i;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the starting number");
        m=scan.nextInt();
        System.out.println("enter the ending point");
        n=scan.nextInt();
        for(i=m;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}