/**
 * @author vanku
 * @date 2020/2/15
 * @time 15:30
 * @content 169
 */


public class majorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,3};
        System.out.println(solution(nums) + "");
    }

    //Boyer-Moore
    public static int solution(int[] nums){

        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }



}
