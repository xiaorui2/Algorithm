import java.util.Stack;

public class Problem21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack();
        int len1 = pushA.length;
        int len2 = popA.length;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2) {
            s.push(pushA[i]);
            i++;
            while(!s.empty() && s.peek() == popA[j]) {
                s.pop();
                j++;
            }
        }
        if(s.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
