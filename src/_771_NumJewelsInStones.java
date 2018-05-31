/**
 * Created by wilin on 2018/5/31.
 */
public class _771_NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for(int i = 0, len = J.length(); i < len; i++){
            int startIndex = 0;
            while(true){
                startIndex = S.indexOf(J.charAt(i),startIndex);
                if(startIndex == -1){
                    break;
                }
                num ++ ;
                startIndex ++;
            }
        }
        return num;
    }
}
