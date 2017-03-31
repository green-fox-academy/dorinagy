import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.31..
 */
public class SquareFractal {
  public static void mainDraw(Graphics graphics) {

  }

  public static void drawSquare(Graphics square) {

  }

  public static void fractals(Graphics graphics) {

  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(500, 500));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.add(new TriangleFractal.ImagePanel());
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
