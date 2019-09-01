import java.util.Scanner;

public class Sumavg {
    public static void main(String[]args)
    {
        int [] list = new int[10];
        int i,sum=0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 numbers");
        for(i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
            sum+=list[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(double)sum/10);
    }
}
