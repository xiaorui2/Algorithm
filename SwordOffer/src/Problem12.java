import java.util.Scanner;

public class Problem12 {
    public static double Power(double base, int exponent) {
        if (exponent == 0)
            return 1.0;
        if (base == 0)
            return 0.0;
        double ans = 1.0;
        if (exponent < 0) {
            exponent = -exponent;
            for (int i = 1; i <= exponent; i++) {
                ans = ans / base;
            }
        } else {
            for (int i = 1; i <= exponent; i++) {
                ans = ans * base;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double base = cin.nextDouble();
        int exponent = cin.nextInt();
        System.out.println(Power(base, exponent));
    }
}
