import java.util.HashMap;

/**
 * @author Albert Ku
 * @date 2020/2/19
 * @time 11:38
 * @content 190
 */


public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(new ReverseBits().solution(3)+"");
    }



    public int solution(int num){
        int temp = 0;
        for (int i = 0; i < 32; i++) {
            temp <<= 1;
            temp += num&1;
            num >>=1;
        }
        return temp;
    }


}
