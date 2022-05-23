/**
 * @author vanku
 * @date 2019/6/21
 * @time 14:17
 * @topic 整数反转
 * @ask for  例1：321 = 123
 * 例2：-321=-123
 * 该数小于32位
 * @solution int转String数组，遍历赋值。
 */
public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverseSolution(-123));

    }

    public static int reverseSolution(int x) {

        StringBuffer sx = new StringBuffer(x + "");
        String[] sxReverse = new String[sx.length()];
        for (int i = 0; i < sx.length(); i++) {
            sxReverse[i] = String.valueOf(sx.charAt(i));
        }
        int start = 0;
        for (int i = sxReverse.length - 1; i >= 0; i--) {
            String temp = "";
            temp = sxReverse[i];
            sxReverse[i] = sxReverse[start];
            sxReverse[start] = temp;
            start++;
        }
        StringBuffer result=new StringBuffer() ;
        for (String i:sxReverse) {
            result.append(i);
        }
        return Integer.parseInt(result.toString());
    }

}
