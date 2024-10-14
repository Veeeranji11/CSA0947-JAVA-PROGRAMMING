import java.util.Scanner;
public class Cube{
    public static void main(String[] args){
        int i,n;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number");
        n=scan.nextInt();
        for(i=0;i<=n/2;i++)
        {
            if(n==i*i*i)
            {
                System.out.println("true");
                break;
            }
            else{
                System.out.println("false");
            }
        }
    }
}