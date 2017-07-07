import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class RecursiveBox {
  public static void mainDraw(Graphics graphics) {
    drawBox(graphics);
    fractals(graphics, 0, 0, 600);
  }

  public static void drawBox(Graphics drawBox) {
    drawBox.setColor(Color.yellow);
    drawBox.fillRect(0, 0, 600, 600);
    drawBox.setColor(Color.black);
    drawBox.drawRect(0, 0, 600, 600);
  }

  public static void drawLine(Graphics graphics, int x, int y, int i) {
    graphics.setColor(Color.black);
    graphics.drawLine(x + (i / 3), y, x + (i / 3), y + i);
    graphics.drawLine(x + ((i / 3) * 2), y, x + ((i / 3) * 2), y + i);
    graphics.drawLine(x, y + (i / 3), x + i, y + (i / 3));
    graphics.drawLine(x, y + ((i / 3) * 2), x + i, y + ((i / 3) * 2));
  }
  public static void fractals(Graphics graphics, int x, int y, int i) {
    if (i < 1) {
    return;
    } else {
      drawLine(graphics, x, y, i);
      fractals(graphics, x + (i / 3), y, i / 3);
      fractals(graphics, x, y + (i / 3), i / 3);
      fractals(graphics, x + ((i / 3) * 2), y + (i / 3), i / 3);
      fractals(graphics, x + (i / 3), y + ((i / 3) * 2), i / 3);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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
