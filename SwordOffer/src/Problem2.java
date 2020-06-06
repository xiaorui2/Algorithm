import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static String replaceSpace(StringBuffer str) {
        int len = str.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < len; i ++) {
            if (str.charAt(i) == ' ') {
                ans.append("%20");
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        StringBuffer str = new StringBuffer(s);
        String ans = replaceSpace(str);
        System.out.println(ans);
    }
}
