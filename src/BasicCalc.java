

import java.util.Scanner;

public class BasicCalc {

    public static void main(String[]args)
    {
        int n1,n2,op;
        float res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        n2 = sc.nextInt();

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");

        op = sc.nextInt();
        switch (op)
        {
            case 1 : System.out.println(n1+n2);
            break;
            case 2 : System.out.println(n1-n2);
                break;
            case 3 : System.out.println(n1*n2);
                break;
            case 4 : System.out.println(n1/n2);
                break;
                default: System.out.println("Error");
        }


    }
}
