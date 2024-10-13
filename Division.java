import java.util.Scanner;
public class Division{
    public static void main(String[] args){
        int a,b,q,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        a=scan.nextInt();
        System.out.println("enter the second number");
        b=scan.nextInt();
        q=a%b;
        r=a%b;
        System.out.println(q);
        System.out.println(r);
        
    }
}