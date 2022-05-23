import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * @author vanku
 * @date 2020/4/21
 */
public class BaseDemo {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
//        System.out.println(new BaseDemo().function1(32,8));
//        System.out.println(new BaseDemo().function2(-1325545));
//        System.out.println(new BaseDemo().function3(31));
//        System.out.println(new BaseDemo().function4(12345678));
        System.out.println(new BaseDemo().isOdd(5));
        System.out.println(new BaseDemo().isOdd(6));
    }

    /**
     * 取余(k为2^n次)
     */
    private int function1(int n,int k){
        return n&k-1;
    }

    /**
     * 求绝对值
     */
    private int function2(int n){
        return n >>> 31 ==0?n:(~n)+1;
    }

    /**
     * 取一个符合2^n且大于K的数
     */
    private int function3(int cap){
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    /**
     * 求相反数
     */
    private int function4(int n){
        return (~n)+1;
    }

    /**
     * 判断奇偶数
     */
    public boolean isOdd(int a){
        return (a&1) == 0;
    }


}