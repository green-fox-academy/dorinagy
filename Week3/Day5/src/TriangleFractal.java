import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.31..
 */
public class TriangleFractal {
  public static void mainDraw(Graphics graphics) {
    fractals(graphics, 450, 600, 300, 260);
  }

  public static void drawTriangle(Graphics triangle, int x, int y, int l, int h) {
    int xpoints[] = {x, x - l, x + l};
    int ypoints[] = {y, y - 2*h, y - 2*h};
    int npoints = 3;
    triangle.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void fractals(Graphics graphics, int x, int y, int l, int h) {
    if(l < 3) {
      return;
    } else {
        drawTriangle(graphics, x, y, l, h);
        fractals(graphics, x, y, l / 2, h / 2);
        fractals(graphics, x - (l/2), y - h, l / 2, h / 2);
        fractals(graphics, x + (l/2), y - h, l / 2, h / 2);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(500, 500));
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
