/**
 * Tile
 */
public class Tile {

    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public void printTile(Tile tile) {
        char letter = tile.getLetter();
        int value = tile.getValue();
        System.out.println(letter + " Tile, worth " + value + " points");
    }

    public void testTile() {
        Tile test = Tile('z', 10);
        printTile(test);
    }

    public String toString() {
        return String.format(this.letter + " Tile, worth %02d points", this.value);
    }

    public char getLetter() {
        return this.letter;
    }
    
    public int getValue() {
        return this.value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int val) {
        this.value = val;
    }
}