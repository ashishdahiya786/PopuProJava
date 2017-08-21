import java.util.Scanner;
public class Rev
{
    public static void main(String[] s)
    {
        int n,z=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number...");
        n = scan.nextInt();

        for(int i=5; i<=n; i*=5)
            z = z + (n/i);

        System.out.print(z);
    }
}
