/**
 * @author vanku
 * @createTime 2021年05月16日 13:23:00
 * 求出 nums 中每个 子集 的 异或总和 ，计算并返回这些值相加之 和
 */
public class SubsetXORSum {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6};
        int i = new SubsetXORSum().subsetXORSum(nums);
        System.out.println(i);
    }

    //排列组合
    public int subsetXORSum(int[]nums){
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < 1 << n; i++) {
            int s = 0;
            for (int j = 0; j < n; j++)
                if ((i >> j & 1) != 0)
                    s ^= nums[j];
            res += s;
        }
        return res;
    }

}
