import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        int n,r,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n=scan.nextInt();
        while(n!=0)
        {
            r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        System.out.println(sum);
        
    }
}