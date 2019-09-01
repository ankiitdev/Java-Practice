import java.util.Scanner;

public class VolumeSA {

    public static void main(String[] args) {
        int l, b, h, vol, sa;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        l=sc.nextInt();

        System.out.print("Enter the breadth: ");
        b=sc.nextInt();

        System.out.print("Enter the height: ");
        h=sc.nextInt();

        System.out.println("The surface area is "+(2*(l*b)+(b*h)+(h*l)));
        System.out.println("The volume is "+(l*b*h));
    }
}
