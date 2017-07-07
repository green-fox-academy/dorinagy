import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class Drawing2 {
  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
    graphics.setColor(Color.BLUE);
    graphics.drawLine(10,10, 60,10);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(60,10,60,30);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(60,30,10,30);
    graphics.setColor(Color.RED);
    graphics.drawLine(10,30,10,10);

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
