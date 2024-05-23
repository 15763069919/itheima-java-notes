package practise.Implements.带有接口和抽象类的JavaBean;

public class Test {
    public static void main(String[] args) {
        Paddler p = new Paddler("zhangsan", 23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.SpeakEnglish();
        p.study();

        Hoopster h = new Hoopster("lisi", 24);
        System.out.println(h.getName());
        System.out.println(h.getAge());
        h.study();

        BasketballCoach b = new BasketballCoach("wangwu", 25);
        System.out.println(b.getName());
        System.out.println(b.getAge());
        b.teach();

        TableTennisCoach t = new TableTennisCoach("zhaoliu", 26);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        t.SpeakEnglish();
        t.teach();

    }
}
