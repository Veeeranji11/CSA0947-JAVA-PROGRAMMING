import java.util.Scanner;
public class Perfect{
    public static void main(String[] args){
        int n,r,sum=0,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n=scan.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
}