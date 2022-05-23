/**
 * @author vanku
 * @date 2019/12/14
 * @time 17:11
 */


public class Strstr {
    public static void main(String[] args) {

        System.out.println( strStr("abcdefg","efg"));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
