import java.util.Scanner;

public class Problem7 {
    public static int Fibonacci(int n) {
        int[] a = new int[45];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2;i <= n;i ++)
            a[i] = a[i-1] + a[i-2];
        return a[n];
    }

    public static int Fibonacci2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci2(n-1) + Fibonacci2(n - 2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Fibonacci(n));
    }
}
