package practise.Static;

public class demo1 {//静态变量、函数与非静态变量、函数
    //静态变量
    public static int have = 10;
    //非静态变量
    public int nohave = 666;
    //静态函数
    public static void State(){
        System.out.println("haveState!");
    }
    //非静态函数
    public void noState(){
        System.out.println("no have State!");
    }
    //main
    public static void main(String[] args) {
        //定义对象
        demo1 dm = new demo1();

         //【静态】
        //静态变量直接访问 √
        System.out.println(have);
        //静态变量通过类名访问 √
        System.out.println(demo1.have);
        //静态变量通过对象实例访问 √
        System.out.println(dm.have);
        //静态函数直接访问 √
        State();
        //静态函数通过类名访问 √
        demo1.State();
        //静态函数通过对象实例访问 √
        dm.State();



        //【非静态】
        //非静态变量直接访问 ×
        //System.out.println(nohave);//err
        //非静态变量通过类名访问 ×
        //System.out.println(demo1.nohave); //err
        //非静态变量通过对象实例访问 √
        System.out.println(dm.nohave);
        // 非静态函数直接访问 ×
        //noState();//err
        //非静态函数通过类名访问 ×
        //demo1.noState();//err
        //非静态函数通过对象实例访问 √
        dm.noState();

    }
}
