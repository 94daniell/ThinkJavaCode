/**
 * Recursion exercise.
 */
public class Recurse {

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        String test = "a e i o u";
        System.out.println(first(test));
        System.out.println(rest(test));
        System.out.println(middle(test));
        System.out.println(length(test));
        printBackward(test);
        System.out.println(reverseString("coffee"));
    }

    public static void printString(String s) {
        while (length(s) > 0) {
            System.out.println(first(s));
            s = rest(s);
        }
    }

    public static void printBackward(String s) {
        if (length(s) == 0) {
            return;
        } else {
            printBackward(rest(s));
            System.out.println(first(s));
        }
    }
    
    public static String reverseString(String s) {
        if (length(s) == 1) {
            return s;
        } else {
            return reverseString(rest(s)) + first(s);
        }
    }

    public static boolean isPalindrome(String s) {
        String test = s.toLowerCase();
        if (length(test) == 1) {
            return true;
        } else if (length(test) == 2) {
            return test.charAt(0) == test.charAt(1);
        } else {
            return (test.charAt(0) == test.charAt(test.length() - 1)) && isPalindrome(middle(s));
        }
    }

    public static boolean isAbecedarian(String s) {
        String test = s.toLowerCase();
        for (int i = 1; i < test.length(); i++) {
            if (test.charAt(i) < test.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDoubloon(String s) {
        int[] letterCount = new int[26];
        String test = s.toLowerCase();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) < 'a' || test.charAt(i) > 'z') {
                continue;
            } else {
                letterCount[test.charAt(i) - 'a']++;
            }
        }
        for (int count : letterCount) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }
}
