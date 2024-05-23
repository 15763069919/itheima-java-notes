package classPractise;

public class Êä³öÏ£À°×ÖÄ¸ {
    public static void main(String[] args) {
        // your code
        GreekAlphabet();
    }

    public static void GreekAlphabet() {
        for (int i = 945; i <= 969; i++) {
            if (i == 962)
                continue;
            else {

                if (i == 969)
                    System.out.print((char) i);
                else
                    System.out.print((char) i + ",");
            }
        }
    }
// your code
}
