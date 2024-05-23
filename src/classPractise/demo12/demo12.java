package classPractise.demo12;

public class demo12 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, World!");
            }
        };
        greeting.greet();
    }
}

interface Greeting {
    void greet();
}
