package practise.Implements.���нӿںͳ������JavaBean;

public class TableTennisCoach extends Coach implements SpeakEnglish {

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("��ƹ����");
    }

    @Override
    public void SpeakEnglish() {

    }

    public String toString() {
        return "TableTennisCoach{}";
    }
}
