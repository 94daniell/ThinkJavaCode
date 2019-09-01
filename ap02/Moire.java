import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        // int i = 90;
        // while (i < getWidth()) {
        //     g.drawOval(getWidth() / 2 - i / 2, getHeight() / 2 - i / 2, i, i);
        //     i = i + 3;
        // }
        radial(g);
    }
    
    public void radial(Graphics g) {
        int i = 0;
        int j = 0;
        while (i <= getWidth() && j <= getHeight()) {
            g.drawLine(i, 0, getWidth() - i, getHeight());
            g.drawLine(0, j, getWidth(), getHeight() - j);
            i = i + 5;
            j = j + 5;
        }
        g.drawLine(0, getHeight(), getWidth(), 0);
        
    }

}
