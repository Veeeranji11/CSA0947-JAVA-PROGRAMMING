import java.util.Scanner;
public class Fabonocci{
    public static void main(String[] args){
        int num1=0,num2=1,next,i,n=5;
        for(i=0;i<=n;i++)
        {
            next=num1+num2;
            num1=num2;
            num2=next;
            System.out.println(num1);
        }
        
    }
}