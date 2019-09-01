/**
 * Fruit exercise.
 */
public class Fruit {

    public static int banana(int[] a) { //Takes product of all elements
        int kiwi = 1; // Final product of all list elements
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    public static int grapefruit(int[] a, int grape) { // Searches for grape in a
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    public static int pineapple(int[] a, int apple) { // Counts the number of times apple appears in a
        int pear = 0; // Total number of appearances of apple in a
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
