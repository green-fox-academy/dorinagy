import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics){
    int x1 = 150;
    int y1 = 0;
    int x2 = 300;
    int y2 = 0;
    for (int i = 0; i < 7.5; i++) {
      graphics.setColor(Color.CYAN);
      graphics.drawLine(x1, y1, x2, y2);
      x1 += 20;
      y2 += 20;
    }

    x1 = 0;
    y1 = 150;
    x2 = 0;
    y2 = 300;

    for (int i = 0; i < 7.5; i++) {
      graphics.setColor(Color.DARK_GRAY);
      graphics.drawLine(x1, y1, x2, y2);
      y1 += 20;
      x2 += 20;
    }

    x1 = 150;
    y1 = 150;
    x2 = 150;
    y2 = 300;

    for (int i = 0; i < 7.5; i++) {
      graphics.setColor(Color.DARK_GRAY);
      graphics.drawLine(x1, y1, x2, y2);
      y1 += 20;
      x2 += 20;
    }

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
