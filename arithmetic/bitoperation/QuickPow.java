/**
 * @author vanku
 * @date 2020/6/18
 */


public class QuickPow {

    /**
     * 快速幂
     * time complexity: O(logN)
     * space complexity
     */
    public int quickPow(int base, int power) {
        int result = 1;
        while (power > 0) {
            if (power % 2 ==1) {
                result *= base;
            }
            base *= base;
            power >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new QuickPow().quickPow(2, 2);
        System.out.println(i);
    }
}
