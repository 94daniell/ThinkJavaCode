import java.util.Arrays;
import java.util.Random;


/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;
    private Random random = new Random();

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Card card : cards) {
            output.append(card.toString() + "\n");
        }
        return output.toString();
        //return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        if (high < low) {
            int placeholder = low;
            low = high;
            high = placeholder;
        }
        int rand = random.nextInt(high - low + 1);
        rand += low;
        return rand;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
        Card card1 = cards[i];
        cards[i] = cards[j];
        cards[j] = card1;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = randomInt(i, cards.length - 1);
            swapCards(i, j);
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        int min = low;
        for (int i = low+1; i <= high; i++) {
            if (cards[i].compareTo(cards[min]) == -1) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        int j;
        for (int i = 0; i < cards.length; i++) {
            if ((j = indexLowest(i, cards.length-1)) >i ) {
                swapCards(i, j);
            }
        }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        int fullDeck = d1.cards.length + d2.cards.length;
        Deck combine = new Deck(fullDeck);
        int i = 0;
        int j = 0;
        for (int k = 0; k < fullDeck; k++) {
            if (i >= d1.cards.length) {
                combine.cards[k] = d2.cards[j];
                j++;
            } else if (j >= d2.cards.length) {
                combine.cards[k] = d1.cards[i];
                i++;
            } else if (d1.cards[i].compareTo(d2.cards[j]) == 1) { // d2 < d1
                combine.cards[k] = d2.cards[j];
                j++;
            } else if (d1.cards[i].compareTo(d2.cards[j]) == -1) { // d1 < d2
                combine.cards[k] = d1.cards[i];
                i++;
            }
            else { // to avoid freezing i and j if the cards are somehow duplicates
                combine.cards[k] = d1.cards[i];
                i++;
            }
        }

        return combine;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        if (cards.length <= 1) {
            return this;
        }
        Deck d1 = subdeck(0, cards.length / 2 - 1);
        Deck d2 = subdeck(cards.length / 2, cards.length - 1);
        d1 = d1.mergeSort();
        d2 = d2.mergeSort();
        return merge(d1, d2);
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        for (int i = 1; i < cards.length; i++) {
            for (int k = i; k > 0; k--) {
                if (cards[k].compareTo(cards[k-1]) == -1) {
                    swapCards(k, k-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
    }

}
