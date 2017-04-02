import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class EnvelopeStar {
  public static void mainDraw(Graphics graphics){
    int x1 = 150;
    int y1 = 0;
    int x2 = 150;
    int y2 = 150;
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(x1, y1, x2, y2);
      x2 += 10;
      y1 += 10;
    }

    x1 = 150;
    y1 = 0;
    x2 = 150;
    y2 = 150;
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(x1, y1, x2, y2);
      x2 -= 10;
      y1 += 10;
    }

    x1 = 150;
    y1 = 300;
    x2 = 150;
    y2 = 150;
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(x1, y1, x2, y2);
      x2 += 10;
      y1 -= 10;
    }

    x1 = 150;
    y1 = 300;
    x2 = 150;
    y2 = 150;
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(x1, y1, x2, y2);
      x2 -= 10;
      y1 -= 10;
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
