/**
 * Created by wilin on 2018/5/31.
 */
public class _338_CountBits {
    public int[] countBits(int num) {
        int [] bits = new int[num + 1];

        for(int i = 1; i <= num; i++) {
            bits[i] = bits[i>>1] + i%2;
        }
        return bits;
    }
}
