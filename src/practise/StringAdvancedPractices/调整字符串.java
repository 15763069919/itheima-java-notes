package practise.StringAdvancedPractices;

/*
����A��B�����ַ�����A����ת�ǽ�A������ߵ��ַ��ƶ������ұ�
������ɴε�����A���B����ô����True������false
*/
/*
˼·1���ַ�����ȡ
˼·2���ַ������ƶ�
 */
public class �����ַ��� {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";

        System.out.println(checkStr(A,B));
        System.out.println(checkStr2(A,B));
    }
    //����һ��
    //�Ȼ�ȡ��һ���ַ���Ȼ������ַ�����ȡ����һ���ַ�һ���ַ���ƴ�ӵ���һ���ַ�����
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
    //��������
    //������תΪ�ַ����飬Ȼ����в���������ٽ��ַ�����ת��Ϊ�ַ���
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
