package practise.studentManagementSystem.学生管理系统再升级版;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";

    public static void startStudentSystem() {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //界面UI显示
        loop:
        while (true) {
            System.out.println("------------欢迎来到ckkk学生管理系统--------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的操作：");
            //键盘录入操作
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            //执行键盘对应操作
            switch (choose) {
                //增
                case ADD_STUDENT -> addStudent(list);
                //删
                case DELETE_STUDENT -> deleteStudent(list);
                //改
                case UPDATE_STUDENT -> updateStudent(list);
                //查
                case QUERY_STUDENT -> queryStudent(list);
                //退
                case EXIT -> {
                    System.out.println("【系统】退出成功！");
                    break loop;
                    //或使用停止虚拟机运行System.exit(0);
                }
                //非法
                default -> System.out.println("【系统】输入非法！");
            }
        }
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("----------------------------------");
        System.out.println("【系统】请输入要添加的学生信息");

        while (true) {
            //添加学号
            System.out.println("【系统】【1/4】请输入学生学号：（键入exit以退出）");
            String id = sc.next();
            //exit
            if (id.equals("exit")) return;
            //添加id至对象
            s.setId(id);

            //判断id是否唯一
                //唯一 -- 存入集合
            if (!isContainId(list, s.getId())) break;
                //不唯一 -- 存入失败
            else System.out.println("【系统】id重复，该学生已存在，此次添加失败！");
        }

        //添加姓名
        System.out.println("【系统】【2/4】请输入学生姓名：（键入exit以退出）");
        String name = sc.next();
        //exit
        if (name.equals("exit")) return;
        //添加name至对象
        s.setName(name);
        //添加年龄
        System.out.println("【系统】【3/4】请输入学生年龄：（键入exit以退出）");
        String DO = sc.next();
        //exit
        if (DO.equals("exit")) return;
        //String转int
        int age = Integer.parseInt(DO);
        //添加age至对象
        s.setAge(age);

        //添加地址
        System.out.println("【系统】【4/4】请输入学生地址：（键入exit以退出）");
        String address = sc.next();
        if (address.equals("exit")) return;
        s.setAddress(address);

        //将对象存入集合
        list.add(s);
        System.out.println("【系统】添加成功！");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        //键入待删除学生
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("【系统】请输入待删除学生id");
        String id = sc.next();
        //判断学生是否存在
        //存在
        if (isContainId(list, id)) {
            //获取id对应学生的索引
            //删除学生
            list.remove(idTOIndex(list, id));
            //提示用户
            System.out.println("【系统】id：" + id + "的学生 删除成功！");
        } else {
            System.out.println("【系统】未查询到该学生，删除失败！");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("【系统】请输入要修改的学生学号：（键入exit退出）");
            String id = sc.next();
            //退出
            if (id.equals("exit")) return;
            //判断id是否存在
            index = idTOIndex(list, id);
            //不存在
            if (index == -1) {
                System.out.println("【系统】学号: " + id + " 不存在，请重新输入！");
            } else
                break;
        }
        //存在
        loop:
        while (true) {
            System.out.println("【系统】该学生信息如下");
            System.out.println("1:学号：" + list.get(index).getId());
            System.out.println("2:姓名：" + list.get(index).getName());
            System.out.println("3:年龄：" + list.get(index).getAge());
            System.out.println("4:地址：" + list.get(index).getAddress());
            System.out.println("【系统】请输入要修改的学生信息（键入exit退出）");
            String userDo = sc.next();
            //创建学生对象指向集合中的学生对象
            Student s = list.get(index); //指向已经存在的对象，而非新new一个对象
            //对应操作
            switch (userDo) {
                //修改学号
                case "1" -> {
                    //键盘录入
                    System.out.println("【系统】请输入学生学号：");
                    String newId = sc.next();
                    //修改学号
                    s.setId(newId);
                    System.out.println("【系统】id修改成功，当前学号：" + list.get(index).getId());
                }
                //修改姓名
                case "2" -> {
                    //键盘录入
                    System.out.println("【系统】请输入学生姓名：");
                    String newName = sc.next();
                    //修改姓名
                    s.setName(newName);
                    System.out.println("【系统】姓名修改成功，当前姓名：" + list.get(index).getName());
                }
                //修改年龄
                case "3" -> {
                    //键盘录入
                    System.out.println("【系统】请输入学生年龄：");
                    int newAge = sc.nextInt();
                    s.setAge(newAge);
                    System.out.println("【系统】学号修改成功，当前学号：" + list.get(index).getAge());
                }
                //修改地址
                case "4" -> {
                    //键盘录入
                    System.out.println("【系统】请输入学生地址：");
                    String newAddress = sc.next();
                    s.setAddress(newAddress);
                    System.out.println("【系统】学号修改成功，当前学号：" + list.get(index).getAddress());
                }
                case "exit" -> {
                    System.out.println("【系统】您已退出修改信息！");
                    break loop;
                }
                default -> {
                    System.out.println("----------------------------------");
                    System.out.println("【系统】输入非法");
                }
            }
        }
    }
    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("----------------------------------");
            System.out.println("无学生信息，添加后再查询！");
            //结束方法
            return;
        } else {
            System.out.println("----------------------------------");
            System.out.println("学号\t\t\t\t姓名\t\t\t\t年龄\t\t\t\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "\t\t\t  "
                        + list.get(i).getName() + "\t\t\t  "
                        + list.get(i).getAge() + "\t\t\t  "
                        + list.get(i).getAddress() + "\t\t\t  ");
            }

        }
    }
    //判断id是否在集合中
    public static boolean isContainId(ArrayList<Student> list, String id) {
       /* for (int i = 0; i < list.size(); i++) {
            //id在集合中
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return idTOIndex(list, id) >= 0;
    }
    //获取id对应的学生索引
    public static int idTOIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //查找到对应索引
            if (list.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }
}