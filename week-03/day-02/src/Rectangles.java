import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class Rectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.BLUE);
    graphics.drawRect(20, 20, 40, 80);
    graphics.setColor(Color.GREEN);
    graphics.drawRect(100, 60, 100, 80);
    graphics.setColor(Color.RED);
    graphics.drawRect(40, 80, 80, 30);
    graphics.setColor(Color.ORANGE);
    graphics.drawRect(140, 130, 80, 40);

  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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
