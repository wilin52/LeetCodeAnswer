/**
 * Created by wilin on 2018/6/1.
 */
public class _009_IsPalindrome {
    /**
     * 其实可以只计算到最中间就好了.
     */

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int num = x;
        int newNum = 0;
        while(true){
            newNum = newNum * 10 + num % 10 ;
            num /= 10;
            if(num == 0){
                break;
            }
        }

        return newNum - x == 0;
    }
}
