package practise.Implements.带有接口和抽象类的JavaBean;

public class TableTennisCoach extends Coach implements SpeakEnglish {

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void SpeakEnglish() {

    }

    public String toString() {
        return "TableTennisCoach{}";
    }
}
