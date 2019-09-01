import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class japan extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flag of Japan");
        Canvas japan = new japan();
        japan.setSize(600, 400);
        frame.add(japan);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(175, 75, 250, 250);
    }
}