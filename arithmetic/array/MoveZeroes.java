import java.util.Arrays;

/**
 * @author Albert Ku
 * @date 2020/6/17
 * @leetCode 283
 * @title //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * //
 * // 示例:
 * //
 * // 输入: [0,1,0,3,12]
 * //输出: [1,3,12,0,0]
 * //
 * // 说明:
 * //
 * //
 * // 必须在原数组上操作，不能拷贝额外的数组。
 * // 尽量减少操作次数。
 * //
 * // Related Topics 数组 双指针
 * // 👍 767 👎 0
 */


public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,3,0,4,5};
        new MoveZeroes().solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    //time complexity:O(n)
    public void solution(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[insertPos++] = nums[i];
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
