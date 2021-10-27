/**
 * @author Albert Ku
 * @date 2021/10/25
 * @leetCode
 * @title 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 * @timeComplexity
 * @spaceComplexity
 */
public class CountSegments {

    public static void main(String[] args) {
        int i = new CountSegments().countSegments("Hello, my name is John");
//        int i1 = new CountSegments().countSegments("Of all the gin joints in all the towns in all the world,  ");
        System.out.println(i);
//        System.out.println(i1);

    }

    public int countSegments1(String s) {
        boolean perBlank = false;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            //当前等于空 且上一个不等于空
            String s1 = String.valueOf(s.charAt(i));
            if (s1.equals(" ")){
                if (perBlank){
                    result++;
                    perBlank = false;
                }
            }else{
                perBlank = true;
                if (i == s.length()-1){
                    result++;
                }
            }
        }
        return result;
    }

    public int countSegments(String s) {

        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }
        return segmentCount;
    }



}
