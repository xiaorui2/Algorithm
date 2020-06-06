import java.util.ArrayList;

public class Problem19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int n = matrix.length;
        ArrayList<Integer> ans =  new ArrayList<Integer>();
        if(n == 0) {
            return ans;
        }
        int m = matrix[0].length;
        int flag = 0;
        while(n > flag*2 && m > flag*2) {
            int endX = m-flag-1;
            int endY = n-flag-1;
            for(int i=flag;i<=endX;i++) {
                ans.add(matrix[flag][i]);
            }
            if(flag < endY) {
                for (int i=flag+1;i<=endY;i++) {
                    ans.add(matrix[i][endX]);
                }
            }
            if(flag < endX && flag < endY) {
                for (int i=endX-1;i>=flag;i--) {
                    ans.add(matrix[endY][i]);
                }
            }
            if(flag < endX && flag < endY-1) {
                for (int i=endY-1;i>=flag+1;i--) {
                    ans.add(matrix[i][flag]);
                }
            }
            flag++;
        }
        return ans;
    }
}
