package practise.ListAndMap.Collection.Set.哈希表.哈希值;

public class Test1 {
    public static void main(String[] args) {
        //1.创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2= new Student("zhangsan",23);

        //2.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的(因为计算使用的是地址值)
        System.out.println("==========没有重写=========");
        System.out.println(s1.hashCode());  //2003749087
        System.out.println(s2.hashCode());  //1324119927

        System.out.println("==========重写=========");
        System.out.println(s1.hashCode());  //-1461067292
        System.out.println(s2.hashCode());  //-1461067292

        System.out.println("==========字符串内部重写中的哈西碰撞=========");

        System.out.println("abc".hashCode());   //96354
        System.out.println("acD".hashCode());   //96354

    }
}
