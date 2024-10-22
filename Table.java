import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        int m,n,a,t=1,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        m=scan.nextInt();
        System.out.println("enter the second number");
        n=scan.nextInt();
        System.out.println("enter vthe table name");
        a=scan.nextInt();
        for(i=m;i<=n;i++)
        {
            t=a*i;
        System.out.println(a+"*"+i+"="+t);
        }
        
    }
}