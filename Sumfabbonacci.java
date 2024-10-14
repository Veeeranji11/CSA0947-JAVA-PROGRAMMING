import java.util.Scanner;
public class Sumfabbonacci{
    public static void main(String[] args){
        int num1=0,num2=1,next,sum=0,n,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        n=scan.nextInt();
        for(i=0;i<=n;i++)
        {
            next=num1+num2;
            num1=num2;
            num2=next;
            System.out.println(num1);
            sum+=next;
        }
        System.out.println(sum);
        
        
    }
}