import java.util.Scanner;

public class TCSNQT {
    public static void main(String[]args) {
        int x = 0, y = 0, n,mul=0,l=0,m=0;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // n = 3

            mul = mul+10;

            if (i % 2 == 0) {

                // Y axis

                m++;

                if(m%2 !=0 )
                {
                    y = mul;
                }

                else
                {
                    y = (mul)*(-1);
                }


            } else {

                // X axis

                l++;  // l = 1  l = 2

                 // x = 10

                if(l%2 != 0)
                {
                    // +ve x axis
                    x = mul;
                }
                else
                {
                    x = (mul)*(-1);
                }

            }
        }

        System.out.println(x);
        System.out.println(y);
    }
}
