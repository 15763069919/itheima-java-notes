package practise.txtFightingGame;

public class GameTest {
    public static void main(String[] args) {
        //1.������һ����ɫ
        Role r1 = new Role("�Ƿ�",100,'��');
        //2.������һ����ɫ
        Role r2 = new Role("�Ħ��",100,'��');

        //չʾһ�½�ɫ��Ϣ
        r1.showRoleInfo();
        r2.showRoleInfo();

        //3.��ʼ�� �غ�����Ϸ
        while (true) {
            //r1��ʼ����r2
            r1.attack(r2);
            //�ж�r2ʣ��Ѫ��
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O��"+r2.getName());
                break;
            }

            //r2��ʼ����r1
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O��"+r1.getName());
                break;
            }

        }
    }
}
