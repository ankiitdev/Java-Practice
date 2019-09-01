import java.util.Scanner;

public class ArrayTable {

    public static void main(String[] args)
    {
        int n,i;
        int [] tab = new int[10]; //from 1 to 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print table: ");
        n = sc.nextInt();
        int index=0;
        for(i=1; i<=10; i++)
        {
            tab[index] = (n*i);
            System.out.println(tab[index]);
            index++;

        }
    }
}
