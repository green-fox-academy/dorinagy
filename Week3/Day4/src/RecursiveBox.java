import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class RecursiveBox {
  public static void mainDraw(Graphics graphics) {
    drawLines(graphics);

  }

  public static void drawLines(Graphics drawLine) {
    drawLine.setColor(Color.yellow);
    drawLine.fillRect(0, 0, 600, 600);
    drawLine.setColor(Color.black);
    drawLine.drawRect(0, 0, 600, 600);


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
