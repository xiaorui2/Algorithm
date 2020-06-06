import java.util.Scanner;

public class Problem12 {
    public static int cakeNumber(int n) {
        int ans = 1;
        for (int i = 1; i <= n - 1 ; i++) {
            ans = ((ans + 1) * 3) / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = cakeNumber(n);
        System.out.println(ans);
    }
}
