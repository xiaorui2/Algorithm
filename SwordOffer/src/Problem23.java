import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem23 {
    public boolean judge(int [] sequence, int l, int r) {
        if (l >= r)
            return true;
        int i = r - 1;
        while (i >= l && sequence[i] >= sequence[r]) {
            i--;
        }
        for (int j = i; j >= l; j--) {
            if (sequence[j] > sequence[r]) {
                return false;
            }
        }
        return judge(sequence, l, i) && judge(sequence, i + 1, r - 1);
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        ArrayQueue<Integer>  q = new ArrayQueue<Integer>(10);
        List q1;
        int len = sequence.length;
        if (len == 0)
            return false;
        return judge(sequence, 0, len - 1);
    }
}
