package practise.ArraysOfObjects.��������5;

public class StudentTest {
    public static void main(String[] args) {
        //1.��������
        Student arr[] = new Student[3];
        //2.��������
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 23);
        //3.¼������
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //4.�����¶���
        Student stu4 = new Student(4, "zhaoliu", 26);
        //5.�ж��Ƿ�id�ظ�
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //�ظ�
            System.out.println("id�Ѵ���");
        } else {
            //���ظ�
            int count = getCount(arr);
            if (count == arr.length) {
                //���� -- ���������� = �����鳤�� + 1
                Student newArr[] = creatNewArr(arr);
                newArr[count] = stu4;

//                printArr(newArr);
            } else {
                //δ����
                arr[count] = stu4;//getCountͬʱҲ�Ƿ��صĵ�һ��null�������� eg��[stu1,stu2,null],count=2;

//                printArr(arr);
            }
        }
        //6.����idɾ��ѧ����Ϣ
//        int deleteIndex = getIndex(arr,4);
////        System.out.println(getIndex(arr,4));
//        if(deleteIndex>=0&&deleteIndex< arr.length){
//            //����
//            arr[deleteIndex] = null;
//            printArr(arr);
//        }
//        else{
//            System.out.println("ɾ��ʧ�ܣ��޴�id!");
//        }
        //7.����id������������+1
        int findIndex = getIndex(arr,5);
        if(findIndex>=0){
            //����
            //����+1
            int newAge = arr[findIndex].getAge()+1;
            //����ѧ������
            arr[findIndex].setAge(newAge);
            printArr(arr);
            System.out.println("idΪ��"+findIndex+"��ѧ������+1��"+(arr[findIndex].getAge()-1)+"->"+newAge);
        }
        else{
            //������
            System.out.println("�޷��޸�����+1������id������");
        }
    }

    //��ӡ����
    public static void printArr(Student arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
        }
    }

    //�Ƿ��������
    public static boolean contains(Student arr[], int id) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null) {
                Student stu = arr[i];
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //����д���������鳤��
    public static int MY_getCount(Student arr[]) {
        int count = 0, i = 0;
        while (i < arr.length && arr[i] != null) {
            count++;
            i++;
        }
        return count;
    }

    //�������鳤��
    public static int getCount(Student arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                count++;
        }
        return count;
    }

    //��������һ������
    public static Student[] creatNewArr(Student arr[]) {
        Student newArr[] = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //��������
    public static int getIndex(Student arr[],int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null&&arr[i].getId()==id){
                return i;
            }
        }
        return  -1;
    }

}
