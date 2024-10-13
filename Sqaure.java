import java.util.*;
public class Sqaure{
    public static void main(String[] args){
        int r,s,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        r=scan.nextInt();
        s=r*r;
        c=r*r*r;
        System.out.println(s);
        System.out.println(c);
    }
}