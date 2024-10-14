import java.util.Scanner;
public class Sqaureroot{
    public static void main(String[] args){
        int n;
        double s;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n=scan.nextInt();
        s=Math.sqrt(n);
        System.out.println(s);
    }
}