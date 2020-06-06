import java.util.Scanner;

public class Problem8 {
    public static int JumpFloor(int target) {
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return JumpFloor(target-1) + JumpFloor(target - 2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(JumpFloor(n));
    }
}
