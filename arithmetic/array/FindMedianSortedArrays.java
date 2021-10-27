import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Albert Ku
 * @date 2020/3/17
 * @leetCode 4
 * @title 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 * @timeComplexity
 * @spaceComplexity
 */


public class FindMedianSortedArrays {

    public static void main(String[] args) {




    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            source.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            source.add(nums2[i]);
        }



        return 0;
    }


}
