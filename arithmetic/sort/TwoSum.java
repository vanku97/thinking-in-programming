import java.util.HashMap;
import java.util.Map;

/**
 * @author vanku
 * @date 2019/6/21
 * @time 13:42
 * @content: Subject:两数之和  solution: 遍历数组 存储成Hash 根据余值查找下标  conclusion : 时间复杂度O(n) 空间复杂度O(n)
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 17;
        int [] result = twoSum(nums,target);
        for (int temp : result) {
            System.out.println(temp);
        }
    }
    public static int[] twoSum(int[] nums,int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int valueG =  target-nums[i];
            if (map.containsKey(valueG)){
                return  new int[]{map.get(valueG),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
