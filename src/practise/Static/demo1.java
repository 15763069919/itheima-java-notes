package practise.Static;

public class demo1 {//��̬������������Ǿ�̬����������
    //��̬����
    public static int have = 10;
    //�Ǿ�̬����
    public int nohave = 666;
    //��̬����
    public static void State(){
        System.out.println("haveState!");
    }
    //�Ǿ�̬����
    public void noState(){
        System.out.println("no have State!");
    }
    //main
    public static void main(String[] args) {
        //�������
        demo1 dm = new demo1();

         //����̬��
        //��̬����ֱ�ӷ��� ��
        System.out.println(have);
        //��̬����ͨ���������� ��
        System.out.println(demo1.have);
        //��̬����ͨ������ʵ������ ��
        System.out.println(dm.have);
        //��̬����ֱ�ӷ��� ��
        State();
        //��̬����ͨ���������� ��
        demo1.State();
        //��̬����ͨ������ʵ������ ��
        dm.State();



        //���Ǿ�̬��
        //�Ǿ�̬����ֱ�ӷ��� ��
        //System.out.println(nohave);//err
        //�Ǿ�̬����ͨ���������� ��
        //System.out.println(demo1.nohave); //err
        //�Ǿ�̬����ͨ������ʵ������ ��
        System.out.println(dm.nohave);
        // �Ǿ�̬����ֱ�ӷ��� ��
        //noState();//err
        //�Ǿ�̬����ͨ���������� ��
        //demo1.noState();//err
        //�Ǿ�̬����ͨ������ʵ������ ��
        dm.noState();

    }
}
