import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        double r,a,c=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius");
        r=scan.nextFloat();
        a=c*r*r;
        System.out.println(a);
    }
}