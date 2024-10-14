import java.util.Scanner;
public class Simpleinterest{
    public static void main(String[] args){
        int p,i,d,s;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the priniciple");
        p=scan.nextInt();
        System.out.println("enter the rate of interest");
        i=scan.nextInt();
        System.out.println("enter the dates in monthas");
        d=scan.nextInt();
        s=p*d*i/100;
        System.out.println(s);
    }
}