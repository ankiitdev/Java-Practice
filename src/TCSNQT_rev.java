import java.util.Scanner;

public class TCSNQT_rev {

    public static void main(String[] args) {
        int y = 0, n, mul = 0, m = 0;
        double l = 0.0, x = 0.0;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            mul = mul+10;

            if( i%2 != 0)
            {
                //X AXIS x = 10;  x = 30; x= -20

                    m++;
                    double s1 = Math.pow(-1.0, l);
                    x = (x+10);
                    //  x = 50 - 30
                    l = l + 1.0;
                System.out.println(x);

            }

            else
            {
                //Y AXIS
            }

        }



    }
}
