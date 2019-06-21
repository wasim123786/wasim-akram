import java.util.Scanner;
public class Gcd
{
     public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int Gcd=0;
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        int x=(a<b)?a:b;
        for(int i=x;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                Gcd=i;
                break;
            }
        }
        System.out.println("Gcd is "+Gcd);
        sc.close();
    }
}