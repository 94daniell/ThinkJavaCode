/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("hello" + '!');
        System.out.println('h' + "ello!");
        System.out.println('a' + 'b');
        // System.out.println(true + false); Booleans don't support + with anything
        System.out.println('z' - 'a');
        System.out.println(('a' + 3.5));
        System.out.println(1 + 'a');
        System.out.println(1 + "hi");
        System.out.println(1.0 + 'a');
        System.out.println(1.0 + "hi");
        System.out.println("Hello" + 1);
        System.out.println("Hello" + 1.0);
        char x = (char) 97;
        x++;
        System.out.println("" + 'a');

    }

    public static int[] letterHist(String s) {
        sweep = s.toLowerCase();
        int[] hist = new int[26];
        for (char letter : sweep.toCharArray()) {
            if (letter < 'a' || letter > 'z') {
                continue;
            }
            hist[(int) letter - 'a']++;
        }
        return hist;
    }
}