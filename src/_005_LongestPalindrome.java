/**
 * Created by wilin on 2018/6/1.
 */
public class _005_LongestPalindrome {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] tag = new boolean[len][len];
        String substring = "";
        int max = 0;
        for(int i = 0; i < len;i++){
            tag[i][i] = true;
            if(max < 1){
                max = 1;
                substring = s.substring(i,i+1);
            }

            if(i + 1 < len){
                if(s.charAt(i) == s.charAt(i+ 1)){
                    tag[i][i+1] = true;

                    if(max < 2){
                        max = 2;
                        substring = s.substring(i,i+2);
                    }
                }
            }
        }


        for(int j = 1;j < tag[0].length; j++){
            for(int i = 0;i < j;i++){
                if(s.charAt(j) == s.charAt(i) && tag[i+1][j-1]){
                    tag[i][j] = true;
                    if(max < j - i + 1){
                        max = j - i + 1;
                        substring = s.substring(i,j+1);
                    }
                }
            }
        }

        return substring;
    }
}
