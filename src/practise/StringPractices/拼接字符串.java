package practise.StringPractices;

public class Æ´½Ó×Ö·û´® {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);


    }

    public static String arrToString(int arr[]) {
        if (arr == null)
            return "";
        else if (arr.length == 0)
            return "[]";
        else {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    result += arr[i];
                else
                    result += arr[i] + ",";
            }
            result += "]";
            return result;
        }
    }

}
