import java.util.Scanner;

public class Problem11 {
    public static int NumberOf1(int n) {
        int ans = 0;
        while(n != 0) {
            n &= (n - 1);
            ans ++;
        }
        return ans;
    }

    /*
    只需要将n与1进行相与运算，看结果是不是0，然后再将n右移，再循环上述步骤直到n=0为止。看起来是这样，但是这样做存在一定的问题。
    题目中明确说出n可能为负数，如果将负数右移，那么高位会被符号1填充，这就导致结果不正确。不过在java中，可以使用“>>>”进行无符号右移。
     */
    public static int NumberOf2(int n) {
        int cnt = 0;
        while(n!=0){
            if((n&1)!=0)
                cnt++;
            n=n>>>1;  //java没有unsigned关键字，>>>就是java中的无符号右移
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(NumberOf1(n));
    }
}
