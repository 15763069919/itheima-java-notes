package practise.StringAdvancedPractices;

/*
给定A、B两个字符串，A的旋转是将A的最左边的字符移动到最右边
如果若干次调整后，A变成B，那么返回True，否则false
*/
/*
思路1：字符串截取
思路2：字符数组移动
 */
public class 调整字符串 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";

        System.out.println(checkStr(A,B));
        System.out.println(checkStr2(A,B));
    }
    //【法一】
    //先获取第一个字符，然后进行字符串截取，将一个字符一个字符串拼接到另一个字符串中
    public static String adjustStr(String str){
        return str.substring(1)+str.charAt(0);
    }
    public static boolean checkStr(String A,String B){
        for (int i = 0;i<A.length();i++) {
            A = adjustStr(A);
            if(A.equals(B))
                return true;
        }
       return false;
    }
    //【法二】
    //把数组转为字符数组，然后进行操作，最后再将字符数组转化为字符串
    public static String adjustStr2(String str){
        char[] arr = str.toCharArray();
        char temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        return new String(arr);
    }
    public static boolean checkStr2(String A,String B){
        adjustStr(A);
        return checkStr(A,B);
    }

}
