import java.util.Scanner;

public class Problem6 {
    public static int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len == 0)
            return 0;
        int low = 0;
        int high = len - 1;
        int mid = low;
        while (array[low] >= array[high]) {
            //左边比右边下标为1时候找到目标值
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (array[mid] >= array[low]) {     //当中间值比左边值大的时候说明最小值还在后面
                low = mid;
            } else if (array[mid] <= array[high]) {     //当中间值比左边值小的时候说明最小值在前面
                high = mid;
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i <= 9; i ++) {
            array[i] = cin.nextInt();
        }
        System.out.println(minNumberInRotateArray(array));
    }
}
