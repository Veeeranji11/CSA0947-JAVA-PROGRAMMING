import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        int r,n,rev=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the digit");
        n=scan.nextInt();
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(rev);
    }
}