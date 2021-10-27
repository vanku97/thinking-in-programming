import java.util.Arrays;

/**
 * @author Albert Ku
 * @date 2019/12/14
 * @time 16:21
 */


public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int count = function(nums, 3);
        System.out.println(count);
    }


    public  static int function(int[]nums,int val){
        // int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


}
