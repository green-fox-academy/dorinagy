import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.31..
 */
public class TriangleFractal {
  public static void mainDraw(Graphics graphics) {
    drawTriangle(graphics);
    fractals(graphics, 0, 0, 600);
  }

  public static void drawTriangle(Graphics triangle) {


  }

  public static void fractals(Graphics graphics, int x, int y, int i) {


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
