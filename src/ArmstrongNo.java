import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[]args)
    {
        int num,rem,res=0,orgnum,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        orgnum = num;
        while(num != 0)
        {
            rem = num%10;
            res = res + (rem*rem*rem);
            num = num/10;
            i++;
        }

        if(res == orgnum)
        {
            System.out.print("Armstrong number");
            System.out.print("Number of digits "+i);
        }
        else
        {
            System.out.print("Not an Armstrong number");
            System.out.print("Number of digits "+i);
        }
    }
}
