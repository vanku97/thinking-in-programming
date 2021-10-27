import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Albert Ku
 * @date 2019/11/19
 * @time 13:25
 * @content
 */


public class RemoveDuplicates {

    ReentrantLock reentrantLock = new ReentrantLock();
    public static void main(String[] args) {

//        int[] nums = new int[]{1,2,2,3,4,5};
        int[] nums = new int[]{1,1,2};
        System.out.println(function(nums));

    }

    public  static int function(int[] nums){
        int i = 0;
        for(int j =1 ; j< nums.length;j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return ++i;

    }




}
