package practise.ListAndMap.Collection.Set.��ϣ��.��ϣֵ;

public class Test1 {
    public static void main(String[] args) {
        //1.��������
        Student s1 = new Student("zhangsan",23);
        Student s2= new Student("zhangsan",23);

        //2.���û����дhashCode��������ͬ���������Ĺ�ϣֵ�ǲ�ͬ��(��Ϊ����ʹ�õ��ǵ�ֵַ)
        System.out.println("==========û����д=========");
        System.out.println(s1.hashCode());  //2003749087
        System.out.println(s2.hashCode());  //1324119927

        System.out.println("==========��д=========");
        System.out.println(s1.hashCode());  //-1461067292
        System.out.println(s2.hashCode());  //-1461067292

        System.out.println("==========�ַ����ڲ���д�еĹ�����ײ=========");

        System.out.println("abc".hashCode());   //96354
        System.out.println("acD".hashCode());   //96354

    }
}
