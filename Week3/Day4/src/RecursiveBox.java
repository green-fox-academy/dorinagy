import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class RecursiveBox {
  public static void mainDraw(Graphics graphics) {
    drawBoxes(graphics);
    int i1 = 600;
    int n1 = 0;
    //drawLines(graphics);
  }

  public static void drawBoxes(Graphics drawBox) {
    drawBox.setColor(Color.yellow);
    drawBox.fillRect(0, 0, 600, 600);
    drawBox.setColor(Color.black);
    drawBox.drawRect(0, 0, 600, 600);
  }

  public static void drawLines(Graphics drawLine) {
    drawLine.setColor(Color.black);
    drawLine.drawLine(200, 0, 200, 600);
    drawLine.drawLine(400, 0, 400, 600);
    drawLine.drawLine(0, 200, 600, 200);
    drawLine.drawLine(0, 400, 600, 400);
  }

  public static void fractals(Graphics graphics, int i, int n) {
    graphics.setColor(Color.black);
    graphics.drawLine(0, i / 3, i, i / 3);
    graphics.drawLine(i / 3 * 2, 0, i / 3 * 2, i);
    graphics.drawLine(i / 3, 0, i / 3, i);
    graphics.drawLine(0, i / 3 * 2, i, i / 3 * 2);
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
