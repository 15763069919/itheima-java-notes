package practise.studentManagementSystem.ѧ������ϵͳ��������;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";

    public static void startStudentSystem() {
        //��������
        ArrayList<Student> list = new ArrayList<>();
        //����UI��ʾ
        loop:
        while (true) {
            System.out.println("------------��ӭ����ckkkѧ������ϵͳ--------");
            System.out.println("1:���ѧ��");
            System.out.println("2:ɾ��ѧ��");
            System.out.println("3:�޸�ѧ��");
            System.out.println("4:��ѯѧ��");
            System.out.println("5:�˳�");
            System.out.println("���������Ĳ�����");
            //����¼�����
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            //ִ�м��̶�Ӧ����
            switch (choose) {
                //��
                case ADD_STUDENT -> addStudent(list);
                //ɾ
                case DELETE_STUDENT -> deleteStudent(list);
                //��
                case UPDATE_STUDENT -> updateStudent(list);
                //��
                case QUERY_STUDENT -> queryStudent(list);
                //��
                case EXIT -> {
                    System.out.println("��ϵͳ���˳��ɹ���");
                    break loop;
                    //��ʹ��ֹͣ���������System.exit(0);
                }
                //�Ƿ�
                default -> System.out.println("��ϵͳ������Ƿ���");
            }
        }
    }
    //���ѧ��
    public static void addStudent(ArrayList<Student> list) {
        //����¼��
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("----------------------------------");
        System.out.println("��ϵͳ��������Ҫ��ӵ�ѧ����Ϣ");

        while (true) {
            //���ѧ��
            System.out.println("��ϵͳ����1/4��������ѧ��ѧ�ţ�������exit���˳���");
            String id = sc.next();
            //exit
            if (id.equals("exit")) return;
            //���id������
            s.setId(id);

            //�ж�id�Ƿ�Ψһ
                //Ψһ -- ���뼯��
            if (!isContainId(list, s.getId())) break;
                //��Ψһ -- ����ʧ��
            else System.out.println("��ϵͳ��id�ظ�����ѧ���Ѵ��ڣ��˴����ʧ�ܣ�");
        }

        //�������
        System.out.println("��ϵͳ����2/4��������ѧ��������������exit���˳���");
        String name = sc.next();
        //exit
        if (name.equals("exit")) return;
        //���name������
        s.setName(name);
        //�������
        System.out.println("��ϵͳ����3/4��������ѧ�����䣺������exit���˳���");
        String DO = sc.next();
        //exit
        if (DO.equals("exit")) return;
        //Stringתint
        int age = Integer.parseInt(DO);
        //���age������
        s.setAge(age);

        //��ӵ�ַ
        System.out.println("��ϵͳ����4/4��������ѧ����ַ��������exit���˳���");
        String address = sc.next();
        if (address.equals("exit")) return;
        s.setAddress(address);

        //��������뼯��
        list.add(s);
        System.out.println("��ϵͳ����ӳɹ���");
    }
    //ɾ��ѧ��
    public static void deleteStudent(ArrayList<Student> list) {
        //�����ɾ��ѧ��
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("��ϵͳ���������ɾ��ѧ��id");
        String id = sc.next();
        //�ж�ѧ���Ƿ����
        //����
        if (isContainId(list, id)) {
            //��ȡid��Ӧѧ��������
            //ɾ��ѧ��
            list.remove(idTOIndex(list, id));
            //��ʾ�û�
            System.out.println("��ϵͳ��id��" + id + "��ѧ�� ɾ���ɹ���");
        } else {
            System.out.println("��ϵͳ��δ��ѯ����ѧ����ɾ��ʧ�ܣ�");
        }
    }
    //�޸�ѧ��
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("��ϵͳ��������Ҫ�޸ĵ�ѧ��ѧ�ţ�������exit�˳���");
            String id = sc.next();
            //�˳�
            if (id.equals("exit")) return;
            //�ж�id�Ƿ����
            index = idTOIndex(list, id);
            //������
            if (index == -1) {
                System.out.println("��ϵͳ��ѧ��: " + id + " �����ڣ����������룡");
            } else
                break;
        }
        //����
        loop:
        while (true) {
            System.out.println("��ϵͳ����ѧ����Ϣ����");
            System.out.println("1:ѧ�ţ�" + list.get(index).getId());
            System.out.println("2:������" + list.get(index).getName());
            System.out.println("3:���䣺" + list.get(index).getAge());
            System.out.println("4:��ַ��" + list.get(index).getAddress());
            System.out.println("��ϵͳ��������Ҫ�޸ĵ�ѧ����Ϣ������exit�˳���");
            String userDo = sc.next();
            //����ѧ������ָ�򼯺��е�ѧ������
            Student s = list.get(index); //ָ���Ѿ����ڵĶ��󣬶�����newһ������
            //��Ӧ����
            switch (userDo) {
                //�޸�ѧ��
                case "1" -> {
                    //����¼��
                    System.out.println("��ϵͳ��������ѧ��ѧ�ţ�");
                    String newId = sc.next();
                    //�޸�ѧ��
                    s.setId(newId);
                    System.out.println("��ϵͳ��id�޸ĳɹ�����ǰѧ�ţ�" + list.get(index).getId());
                }
                //�޸�����
                case "2" -> {
                    //����¼��
                    System.out.println("��ϵͳ��������ѧ��������");
                    String newName = sc.next();
                    //�޸�����
                    s.setName(newName);
                    System.out.println("��ϵͳ�������޸ĳɹ�����ǰ������" + list.get(index).getName());
                }
                //�޸�����
                case "3" -> {
                    //����¼��
                    System.out.println("��ϵͳ��������ѧ�����䣺");
                    int newAge = sc.nextInt();
                    s.setAge(newAge);
                    System.out.println("��ϵͳ��ѧ���޸ĳɹ�����ǰѧ�ţ�" + list.get(index).getAge());
                }
                //�޸ĵ�ַ
                case "4" -> {
                    //����¼��
                    System.out.println("��ϵͳ��������ѧ����ַ��");
                    String newAddress = sc.next();
                    s.setAddress(newAddress);
                    System.out.println("��ϵͳ��ѧ���޸ĳɹ�����ǰѧ�ţ�" + list.get(index).getAddress());
                }
                case "exit" -> {
                    System.out.println("��ϵͳ�������˳��޸���Ϣ��");
                    break loop;
                }
                default -> {
                    System.out.println("----------------------------------");
                    System.out.println("��ϵͳ������Ƿ�");
                }
            }
        }
    }
    //��ѯѧ��
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("----------------------------------");
            System.out.println("��ѧ����Ϣ����Ӻ��ٲ�ѯ��");
            //��������
            return;
        } else {
            System.out.println("----------------------------------");
            System.out.println("ѧ��\t\t\t\t����\t\t\t\t����\t\t\t\t��ͥסַ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "\t\t\t  "
                        + list.get(i).getName() + "\t\t\t  "
                        + list.get(i).getAge() + "\t\t\t  "
                        + list.get(i).getAddress() + "\t\t\t  ");
            }

        }
    }
    //�ж�id�Ƿ��ڼ�����
    public static boolean isContainId(ArrayList<Student> list, String id) {
       /* for (int i = 0; i < list.size(); i++) {
            //id�ڼ�����
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return idTOIndex(list, id) >= 0;
    }
    //��ȡid��Ӧ��ѧ������
    public static int idTOIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //���ҵ���Ӧ����
            if (list.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }
}