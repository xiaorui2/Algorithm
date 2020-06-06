import java.util.Scanner;

public class Problem10 {
    public static int RectCover(int target) {
        if(target<=0)
            return 0;
        else if(target == 1 || target == 2)
            return target;
        else
            return RectCover(target-1)+RectCover(target-2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(RectCover(n));
    }
}
