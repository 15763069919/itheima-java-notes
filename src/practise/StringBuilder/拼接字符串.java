package practise.StringBuilder;

public class 拼接字符串 {
    public static void main(String[] args) {
        //1.定义数组
        int arr[] = {1, 2, 3};

        //2.调用方法把数组变为字符串
        System.out.println(arrToString(arr));

    }

    public static String arrToString(int arr[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                sb.append(arr[i]);
            else
                sb.append(arr[i] + ",");
        }
        sb.append("]");
        return sb.toString();

    }


}
