import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.31..
 */
public class SquareFractal {
  public static void mainDraw(Graphics graphics) {
    fractals(graphics, 250, 250, 100, 100);
  }

  public static void drawSquare(Graphics square, int x, int y, int l, int h) {
    square.fillRect(x - l/2, y - h/2, l, h);
  }

  public static void fractals(Graphics graphics, int x, int y, int l, int h) {
    if (l < 1) {
      return;
    } else {
      drawSquare(graphics, x, y, l, h);
      graphics.setColor(Color.CYAN);
      fractals(graphics, x + l, y, l / 3, h / 3);
      graphics.setColor(Color.RED);
      fractals(graphics, x - l, y, l / 3, h / 3);
      graphics.setColor(Color.GREEN);
      fractals(graphics, x, y + h, l / 3, h / 3);
      graphics.setColor(Color.MAGENTA);
      fractals(graphics, x, y - h, l / 3, h / 3);
      graphics.setColor(Color.ORANGE);
      fractals(graphics, x + l, y - h, l / 3, h / 3);
      graphics.setColor(Color.blue);
      fractals(graphics, x - l, y - h, l / 3, h / 3);
      graphics.setColor(Color.pink);
      fractals(graphics, x + l, y + h, l / 3, h / 3);
      graphics.setColor(Color.yellow);
      fractals(graphics, x - l, y + h, l / 3, h / 3);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(500, 500));
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
