import com.sun.tools.javac.util.StringUtils;

/**
 * @author Albert Ku
 * @date 2021/10/27
 * @leetCode
 * @title
 * @timeComplexity
 * @spaceComplexity
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        String s = new DayOfTheWeek().dayOfTheWeek1(8, 1, 1971);
        System.out.println(s);
    }

    public String dayOfTheWeek(int day, int month, int year) {
        int sum = 4;
        if (year != 1971) {
            for (int i = 1971; i < year; i++) {
                sum += Tianshu(i);
            }
        }


        String[] arr = new String[7];
        arr[0] = "Sunday";
        arr[1] = "Monday";
        arr[2] = "Tuesday";
        arr[3] = "Wednesday";
        arr[4] = "Thursday";
        arr[5] = "Friday";
        arr[6] = "Saturday";
        int[] brr = new int[12];
        brr[0] = 31;
        brr[2] = 31;
        brr[3] = 30;
        brr[4] = 31;
        brr[5] = 30;
        brr[6] = 31;
        brr[7] = 31;
        brr[8] = 30;
        brr[9] = 31;
        brr[10] = 30;
        brr[11] = 31;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            brr[1] = 29;
            if (month == 1) {
                return arr[(day + sum) % 7];
            }
            for (int i = 0; i < month - 1; i++) {
                sum += brr[i];
            }
            sum += day;
            return arr[sum % 7];
        } else {
            brr[1] = 28;
            if (month == 1) {
                return arr[(day + sum) % 7];
            }
            for (int i = 0; i < month - 1; i++) {
                sum += brr[i];
            }
            sum += day;
            return arr[sum % 7];
        }
    }

    public int Tianshu(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return 366;
        }
        return 365;
    }


    /**
     * 给定年月日计算星期几的公式有多种，此处列举一个计算方便的公式。
     * W = x + [x / 4] + [c / 4] - 2c + [26(m + 1) / 10] + d - 1
     * 其中，c表示年份前两位，x表示年份后两位，m表示月，1月和2月看成上一年的13月和14月，d表示日。方括号表示向下取整。对W计算除以7的余数即可知道是星期几，余数是0表示星期日，余数是1到6分别表示星期一到星期六。需要注意的是W可能是负值，因此计算除以7的余数之后需要判断是大于等于0还是小于0，如果小于0则将余数加7。
     * <p>
     * 作者：stormsunshine
     * 链接：https://leetcode-cn.com/problems/day-of-the-week/solution/gen-ju-gong-shi-ji-suan-by-stormsunshine/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public String dayOfTheWeek1(int day, int month, int year) {
        final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (month < 3) {
            month += 12;
            year--;
        }
        int year2 = year / 100, year3 = year % 100;
        int index = year3 + year3 / 4 + year2 / 4 - 2 * year2 + 26 * (month + 1) / 10 + day - 1;
        index %= 7;
        if (index < 0) index += 7;
        return DAYS[index];
    }


}
