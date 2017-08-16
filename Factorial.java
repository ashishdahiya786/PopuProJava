import java.util.Scanner;
class Factorial
{
    public static void main(String[] s)
    {
        int n;
        long val=1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number...");
        n = scan.nextInt();

        for(int i=1; i<=n; i++)
            val = val * i;

        System.out.println(val);
    }
}
