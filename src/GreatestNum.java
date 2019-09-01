import java.util.Scanner;

public class GreatestNum {

    public static void main(String[] args)
    {
        int n1,n2,n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        n2=sc.nextInt();
        System.out.print("Enter the third number: ");
        n3=sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println("The greatest number is "+n1);
        }
        else
        {
            if(n2>n3 && n2>n1)
            {
                System.out.println("The greatest number is "+n2);
            }
            else{
                System.out.println("The greatest number is "+n3);
            }

        }
    }
}
