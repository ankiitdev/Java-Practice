import java.util.Scanner;

public class Factorial {

    public static void main(String[]args)
    {
        int num,fact=1;
        System.out.print("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int onum = num;
        while(num != 0)
        {
            fact = fact*num;
            num--;
        }
        System.out.print("Factorial of "+onum+" is "+fact);
    }
}
