import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class SquareCenter {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawRect(145, 145, 10, 10);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 340));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
