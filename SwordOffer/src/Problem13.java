import java.util.Scanner;

public class Problem13 {
    public static void reOrderArray1(int [] array) {
        int len = array.length;
        if (len == 0)
            return;
        int[] temp1 = new int[len];
        int[] temp2 = new int[len];
        int cnt1 = 0; int cnt2 = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 ==1) {
                temp1[cnt1++] = array[i];
            } else {
                temp2[cnt2++] = array[i];
            }
        }
        for (int i = 0; i < cnt1; i++) {
            array[i] = temp1[i];
        }
        for (int i = 0; i < cnt2; i++) {
            array[i+cnt1] = temp2[i];
        }
    }

    public static void reOrderArray2(int [] array) {
        int len = array.length;
        if (len == 0)
            return;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 1) {
                if (i != j) {
                    int temp = array[i];
                    int k = i;
                    for (k = i; k > j; k--) {
                        array[k] = array[k - 1];
                    }
                    array[k] = temp;

                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    }
}
