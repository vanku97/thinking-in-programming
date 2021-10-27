/**
 * @author Albert Ku
 * @date 2020/1/10
 * @time 15:19
 */
public class IncreasingTriplet {

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 1, 1, 1, 1};
//        Integer[] nums1 = new Integer[]{5, 4, 3, 2, 1};
        System.out.println(function(nums));
//        System.out.println(function(nums1));
    }


    static boolean function(Integer[] nums) {
        Integer one = Integer.MAX_VALUE;
        Integer two = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= one){
                one = n;
            }   else if(n <=two){
                two = n;
            }else{
                return true;
            }
        }
        return false;
    }

}
