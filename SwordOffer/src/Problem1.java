import java.util.Scanner;

public class Problem1 {
    public static boolean Find(int target, int [][] array) {
        if(array == null){
            return false;
        }
        int n = array.length;
        int m = array[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            int temp = array[i][j];
            if(target < temp){
                j--;
            }
            else if(target > temp){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer a =  new Integer(5);
        a = 7;
        System.out.println(a);
        Scanner cin = new Scanner(System.in);
        int[][] array = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = cin.nextInt();
            }
        }
        int target = cin.nextInt();
        System.out.println(Find(target, array));
    }
}
