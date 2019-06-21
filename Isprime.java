import java.util.Scanner;
public class Isprime{
    public static void main (String []args)
    {
        System.out.println("enter a no");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean flag=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0){
                flag=false;
                break;
            } 
        }
        if(flag==true)
        {
            System.out.println(n+" prime");
        }
        else
        {
            System.out.println(n+" not prime");
        }
        s.close();
    }
}