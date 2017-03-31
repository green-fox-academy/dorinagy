import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.31..
 */
public class SquareGrid {
  public static void mainDraw(Graphics graphics){
    int size = 300;
    fractal(size / 4,  size / 4, size / 2, graphics);
  }
  public static void fractal(int x, int y, int size, Graphics graphics) {
    if(size < 10) {
      return;
    }
    graphics.drawRect(x, y, size, size);
    fractal(x - (size / 4), y - (size / 4), size / 2, graphics);
    fractal(x - (size / 4), y + (size / 4) * 3, size / 2, graphics);
    fractal(x + (size / 4) * 3, y - (size / 4), size / 2, graphics);
    fractal(x + (size / 4) * 3, y + (size / 4) * 3, size / 2, graphics);
  }
    public static void main(String[] args) {
     JFrame jFrame = new JFrame("Drawing");
     jFrame.setSize(new Dimension(320, 343));
     jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     jFrame.add(new ImagePanel());
     jFrame.setLocationRelativeTo(null);
     jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);
      }
    }
}

