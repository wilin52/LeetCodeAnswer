/**
 * Created by wilin on 2018/5/31.
 */
public class _020_Valid {
    /**
     * 1. 利用栈来做；
     * 2. 给每个对应符号加权重。
     */

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 > 0)
            return false;

        int sum = 0;
        int num = 0; // 系数
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    num = num + 1;
                    sum = sum + (1 * num);
                    break;
                case '[':
                    num = num + 1;
                    sum = sum + (10 * num);
                    break;
                case '{':
                    num = num + 1;
                    sum = sum + (100 * num);
                    break;
                case ')':
                    if (num == 0)
                        return false;
                    sum = sum - (1 * num);
                    num = num - 1;
                    break;
                case ']':
                    if (num == 0)
                        return false;
                    sum = sum - (10 * num);
                    num = num - 1;
                    break;
                case '}':
                    if (num == 0)
                        return false;
                    sum = sum - (100 * num);
                    num = num - 1;
                    break;

                default:
                    return false;
            }
        }

        return sum == 0;
    }
}
