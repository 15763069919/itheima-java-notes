package practise.StringPractices;

public class ���֤��Ϣ�鿴 {
    public static void main(String[] args) {
        //1.����һ���ַ�����¼���֤����
        String id = "370702200503116218";

        //2.��ȡ����������
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("������ϢΪ��" + year + "��" + month + "��" + day + "��");

        //3.��ȡ�Ա�
        char sex = id.charAt(16);
        //�ַ�'0' -> ����0
        int sexId = sex - '0';
        //����żŮ
        if (sexId % 2 == 0) {
            System.out.println("�Ա�Ϊ��Ů");
        } else {
            System.out.println("�Ա�Ϊ����");
        }
    }
}
