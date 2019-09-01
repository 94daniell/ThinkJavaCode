public class Flush {
    public int[] suitHist(Card[] hand) {
        int[] hist = new int[4];
        for (Card card : hand) {
            hist[card.getSuit()]++;
        }
        return hist;
    }

    public boolean hasFlush(Card[] hand) {
        int[] suits = suitHist(hand);
        for (int suit : suits) {
            if (suit >= 5) {
                return true;
            }
        }
        return false;
    }
}