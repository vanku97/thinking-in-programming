/**
 * @author vanku
 * @date 2020/10/12
 * @leetCode 11
 * @title 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为(i,ai) 和 (i, 0)。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 示例：
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class MaxArea {

    //time complexity：O(n);
    //space complexity：O(1);
    public int solution(int[] height) {
        int i = 0, j = height.length-1,area = 0;
        while (i<j){
            area = Math.max(area,Math.min(height[i],height[j])*(j-i));
            if (height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }

}
