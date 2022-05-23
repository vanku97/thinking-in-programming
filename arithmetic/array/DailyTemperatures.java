import java.util.Arrays;

/**
 * @author vanku
 * @date 2020/3/6
 * @leetCode
 * @timeComplexity
 * @spaceComplexity
 */


public class DailyTemperatures {

    public static void main(String[] args) {
        int[] num = new int[]{73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(num)));
    }


    int[] dailyTemperatures(int[] num) {
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int k = 0;
            for (int j = i + 1; j < num.length; j++) {
                ++k;
                if (num[j] > num[i]) {
                    break;
                }else{
                    if (j+1==num.length)k=0;
                }
            }
            result[i] = k;
        }
        return result;
    }

}
