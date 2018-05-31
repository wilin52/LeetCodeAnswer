/**
 * Created by wilin on 2018/6/1.
 */
public class _008_ATOI {
    /**
     * 注意非法字符/ 越界/ 数字符号
     * 参考Integer.valueOf(String)
     */

    public int myAtoi(String str) {
        if(str == null){
            return 0;
        }

        String formatString =  str.trim();
        if(formatString.length() == 0){
            return 0;
        }

        char firstChar = formatString.charAt(0);
        boolean negative = false;
        int num = 0;
        if (firstChar < '0') { // Possible leading "+" or "-"
            if (firstChar == '-') {
                negative = true;

            } else if (firstChar != '+') {
                return 0;
            }
        } else if(firstChar >  '9') {
            return 0;
        } else {
            num = firstChar - '0';
        }

        for(int i = 1, len = formatString.length(); i < len; i++){
            int charItem = formatString.charAt(i);
            if(charItem> '9' || charItem < '0'){
                break;
            }

            if(num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE/10 && charItem > '7'){
                if(negative){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }

            num = num * 10 + charItem - '0';
        }

        if(negative){
            num =  -num;
        }
        return num;
    }
}
