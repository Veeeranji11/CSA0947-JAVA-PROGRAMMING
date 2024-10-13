import java.util.Scanner;
public class Floating{
    public static void main(String[] args){
        float a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first floatong number");
        a=scan.nextFloat();
        System.out.println("enterthe second floating point");
        b=scan.nextFloat();
        c=a*b;
        System.out.println(c);
    }
}