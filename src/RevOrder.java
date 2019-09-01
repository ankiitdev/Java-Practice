import java.util.Scanner;

public class RevOrder {

    public static void main(String[]args)
    {
        int num;
        System.out.print("Enter the max number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num != 0)
        {
            System.out.println(num);
            num--;
        }
    }
}
