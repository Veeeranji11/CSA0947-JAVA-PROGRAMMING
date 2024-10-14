import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        int i,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n=scan.nextInt();
        if(n<=1)
        {
            System.out.println("not prime");
        }
        else{
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println("not a prime");
                }
            }
        }
        System.out.println("prime number");
    }
}