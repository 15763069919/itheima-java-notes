package practise.ArraysOfObjects.对象数组5;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建数组
        Student arr[] = new Student[3];
        //2.创建对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 23);
        //3.录入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //4.创建新对象
        Student stu4 = new Student(4, "zhaoliu", 26);
        //5.判断是否id重复
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //重复
            System.out.println("id已存在");
        } else {
            //不重复
            int count = getCount(arr);
            if (count == arr.length) {
                //存满 -- 创建新数组 = 老数组长度 + 1
                Student newArr[] = creatNewArr(arr);
                newArr[count] = stu4;

//                printArr(newArr);
            } else {
                //未存满
                arr[count] = stu4;//getCount同时也是返回的第一个null的索引数 eg：[stu1,stu2,null],count=2;

//                printArr(arr);
            }
        }
        //6.根据id删除学生信息
//        int deleteIndex = getIndex(arr,4);
////        System.out.println(getIndex(arr,4));
//        if(deleteIndex>=0&&deleteIndex< arr.length){
//            //存在
//            arr[deleteIndex] = null;
//            printArr(arr);
//        }
//        else{
//            System.out.println("删除失败，无此id!");
//        }
        //7.查找id，存在则年龄+1
        int findIndex = getIndex(arr,5);
        if(findIndex>=0){
            //存在
            //年龄+1
            int newAge = arr[findIndex].getAge()+1;
            //更新学生年龄
            arr[findIndex].setAge(newAge);
            printArr(arr);
            System.out.println("id为："+findIndex+"的学生年龄+1："+(arr[findIndex].getAge()-1)+"->"+newAge);
        }
        else{
            //不存在
            System.out.println("无法修改年龄+1，查找id不存在");
        }
    }

    //打印数组
    public static void printArr(Student arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
        }
    }

    //是否包含测试
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

    //【自写】计算数组长度
    public static int MY_getCount(Student arr[]) {
        int count = 0, i = 0;
        while (i < arr.length && arr[i] != null) {
            count++;
            i++;
        }
        return count;
    }

    //计算数组长度
    public static int getCount(Student arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                count++;
        }
        return count;
    }

    //数组扩大一个长度
    public static Student[] creatNewArr(Student arr[]) {
        Student newArr[] = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //查找索引
    public static int getIndex(Student arr[],int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null&&arr[i].getId()==id){
                return i;
            }
        }
        return  -1;
    }

}
