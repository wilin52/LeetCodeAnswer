/**
 * Created by wilin on 2018/5/31.
 */
public class _003_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int maxLen = 0, subStartIndex = 0;
        for(int i = 0,len = s.length(); i < len; i++ ){
            for(int j = subStartIndex; j<i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    subStartIndex = j+1; // 从重复的下一个开始计算
                    break;
                }
            }
            maxLen = Math.max(maxLen,i - subStartIndex + 1);
        }
        return maxLen;
    }
}
