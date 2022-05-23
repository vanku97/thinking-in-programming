/**
 * 寻找丢失的整数
 * 在一个无序数组里有若干个正整数，范围是1-100，其中98个整数出现了偶数次，只有2个整数出现了奇数次，如何找到这2个出现奇数次的整数？
 * 数组分割成两部分，每部分包含一个奇数，进行^运算最后的数就是丢失的奇数
 * @author vanku
 * @date 2020/4/22
 */
public class FindLostNum {

    public static void main(String[] args) {
        int[] array = {4,1,2,2,5,1,4,3};
        int[] result = findLostNum(array);
        System.out.println(result[0]+","+result[1]);
    }


    private static int[] findLostNum(int[] array){
        //用于存储2个出现奇数次的整数
        int[] result = new int[2];
        //第一次进行整体异或运算
        int xorResult = 0;
        for (int i = 0; i <array.length; i++) {
            xorResult ^= array[i];
        }
        //如果进行异或运算的结果为0，则说明输入的数组不符合题目要求
        if (xorResult==0){
            return null;
        }
        //确定2个整数的不同位，以此来做分组
        int separator = 1;
        while (0==(xorResult&separator)){
            separator <<= 1;
        }
        //第二次分组进行异或运算
        for (int i=0;i<array.length;i++){
            if (0==(array[i]&separator)){
                result[0] ^= array[i];
            }else{
                result[1]^=array[i];
            }
        }
        return result;
    }

}
