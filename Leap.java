import java.util.Scanner;
public class Leap{
    public static void main(String[] args){
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        a=scan.nextInt();
        if(a%4==0 && a%100==0)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}