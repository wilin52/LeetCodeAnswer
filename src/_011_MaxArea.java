/**
 * Created by wilin on 2018/5/31.
 */
public class _011_MaxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0,j = height.length - 1;  i < j;  ){
            int area = Math.min(height[i] , height[j]) * (j - i);
            if(area > maxArea){
                maxArea = area;
            }
            if(height[i] >= height[j]){
                j--;
            } else{
                i++;
            }
        }
        return maxArea;
    }

    /***
     * *public int maxArea(int[] height) {
     int max = 0;
     int area = 0;
     int i = 0, j = height.length - 1;
     while(i<j){
     if(height[i]<height[j]){
     area = (j-i)*height[i];
     i++;
     }else{
     area = (j-i)*height[j];
     j--;
     }
     if(area > max){
     max=area;
     }
     }
     return max;
     }
     * *
     *
     */
}
