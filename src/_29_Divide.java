/**
 * Created by wilin on 2018/5/31.
 */
public class _29_Divide {

    /**
     * 除法可以用减法来替代，但是每次减一个除数对于大数据来说次数会很多。
     * 我们可以这么考虑：例如： 10 = 3* 2 + 3 + 1。那么商就是3。
     * 29 = 4 * 4 + 4 * 2 + 4 + 1；
     * 所以29 = 4 * （0x7 即 0111）+ 1。
     * 所以用移位来解决。
     */

    public int divide(int dividend, int divisor) {
        if(divisor == 0){
            return -1;
        }

        //符号位
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        // 求绝对值,为防止溢出使用long
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long result = 0;
        //主要程序代码
        while(dvs <= dvd){
            long tmp = dvs;
            long mul = 1;
            while(dvd >= (tmp << 1)){
                tmp <<= 1;
                mul <<= 1;
            }
            //减去最接近dvd的dvs的指数倍数的值(值为tmp)
            dvd -= tmp;
            result += mul;
        }

        result *= sign;
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }

        return (int)result;
    }
}
