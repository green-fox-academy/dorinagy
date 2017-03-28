import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class PurpleSteps2 {
  public static void mainDraw(Graphics graphics){
    int size = 10;
      for (int i = 10; i < 200; i += size - 10) {
        graphics.setColor(new Color(153, 58, 164));
        graphics.fillRect(i, i, size, size);
        graphics.setColor(Color.black);
        graphics.drawRect(i, i, size, size);
        size += 10;
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
