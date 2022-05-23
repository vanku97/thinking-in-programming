import java.util.Arrays;
import java.util.Objects;

/**
 *
 * 选择排序
 * @author vanku
 * @date 2020/1/25
 * @time 16:33
 */
public class ChoiceSort implements Cloneable {

    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {2, 8, 13, 11, 6, 7};
        System.out.println("排序前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int lowerIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 找出最小的一个索引
                if (arr[j] < arr[lowerIndex]) {
                    lowerIndex = j;
                }
            }
            // 交换
            int temp = arr[i];
            arr[i] = arr[lowerIndex];
            arr[lowerIndex] = temp;
        }
        System.out.println("排序后：" + Arrays.toString(arr));
        ChoiceSort choiceSort = new ChoiceSort();
        Object clone = choiceSort.clone();
    }

    public void test1(){

    }

}

