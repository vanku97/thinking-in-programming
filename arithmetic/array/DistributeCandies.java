import java.util.Arrays;

/**
 * @author vanku
 * @date 2020/3/5
 * @leetcode 1103
 */


public class DistributeCandies {


    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] ints = distributeCandies.distributeCandies(80, 4);
        System.out.println(Arrays.toString(ints));
    }

    //时间复杂度O(max(√G,N))
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies != 0) {
            ans[i % num_people] += Math.min(candies, i + 1);
            candies -= Math.min(candies, i + 1);
            i += 1;
        }
        return ans;
    }

}
