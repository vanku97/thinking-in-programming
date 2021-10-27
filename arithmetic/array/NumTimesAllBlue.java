/**
 * @author Albert Ku
 * @date 2020/3/8
 * @leetCode
 * @timeComplexity
 * @spaceComplexity
 */


public class NumTimesAllBlue {

    public static void main(String[] args) {
        int i = new NumTimesAllBlue().numTimesAllBlue(new int[]{2, 1, 3});
        System.out.println(i);
    }


    int numTimesAllBlue(int[] light){
        int ans = 0;
        int curMax = 0;
        for (int i = 0; i < light.length; i++) {
            curMax = Math.max(curMax, light[i]);
            if (curMax == i + 1) {
                ans++;
            }
        }
        return ans;
    }
}
