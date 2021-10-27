/**
 * @author Albert Ku
 * @date 2020/3/12
 * @leetCode 1071
 * @title 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 *
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：str1 = "ABCABC", str2 = "ABC"
 * 输出："ABC"
 * 示例 2：
 *
 * 输入：str1 = "ABABAB", str2 = "ABAB"
 * 输出："AB"
 * 示例 3：
 *
 * 输入：str1 = "LEET", str2 = "CODE"
 * 输出：""
 * @timeComplexity
 * @spaceComplexity
 */


public class GcdOfStrings {


    public static void main(String[] args) {

        String str1 = "ABCABCABC";
        String str2 = "ABC";
        String s = gcdOfStrings(str1, str2);
        System.out.println(s);

    }


    static String gcdOfStrings(String str1, String str2){



        return "";
    }


}
