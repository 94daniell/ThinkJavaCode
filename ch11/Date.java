/**
 * Date
 */
public class Date {

    private int month;
    private int day;
    private int year;

    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 2019;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static void main(String[] args) {
        Date birthday = new Date(9, 21, 1994);
    }
}