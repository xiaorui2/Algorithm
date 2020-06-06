import java.util.Scanner;

public class Problem9 {
    public static int JumpFloorII(int target) {
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return 2*JumpFloorII(target-1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(JumpFloorII(n));
    }
}
