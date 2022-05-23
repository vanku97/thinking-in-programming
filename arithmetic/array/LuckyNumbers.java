import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author vanku
 * @date 2020/3/15
 * @leetCode 5356
 * @title 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 *
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 *
 *
 * 示例 1：
 *
 * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * @timeComplexity
 * @spaceComplexity
 */


public class LuckyNumbers {

    public static void main(String[] args) {
        int[][] matrix =  new int[3][3];
        matrix[0][0] = 3;
        matrix[0][1] = 7;
        matrix[0][2] = 8;
        matrix[1][0] = 9;
        matrix[1][1] = 11;
        matrix[1][2] = 13;
        matrix[2][0] = 16;
        matrix[2][1] = 16;
        matrix[2][3] = 17;
        List<Integer> integers = new LuckyNumbers().luckyNumbers(matrix);
        System.out.println(integers);
    }


    public List<Integer> luckyNumbers (int[][] matrix) {
        return null;
    }


}
