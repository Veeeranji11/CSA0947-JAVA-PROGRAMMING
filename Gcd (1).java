public class Gcd{
    public static void main(String[] args){
        int a=10,b=15,i,gcd=1,lcm=1;
        for(i=1;i<a && i<b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd*=i;
            }
            lcm=a*b/gcd;
        }
        System.out.println(gcd);
        System.out.println(lcm);
    }
}