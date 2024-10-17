import java.util.Scanner;
public class User{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the username");
        String user=scan.nextLine();
        if(user.matches("[a-zA-Z]+")  && user.length()<=20 && user.length()>=3)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        
    }
}