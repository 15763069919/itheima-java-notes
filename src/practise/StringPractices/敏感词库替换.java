package practise.StringPractices;

public class ���дʿ��滻 {
    public static void main(String[] args) {
        //1.��ȡ��˵�Ļ�
        String talk = "�������ã��Ժ�Ҫ�����ˣ�TMD��CNM";

        //2.����һ�����дʿ�
        String arr[]={"TMD","CNM","SB","MLGB"};

        //3.ѭ��
        String result;
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
