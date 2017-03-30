import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class RecursivePolygon {
  final public static int TIPOFHEXAGONX = 150;
  final public static int TIPOFHEXAGONY = 150;

  public static void mainDraw(Graphics graphics) {
    drawHexagon(graphics, 1, 2);
  }

  public static void drawHexagon(Graphics graphics, int j, int i){
    int xpoints[] = {i, i+120, i+360, i+480, i+360, i+120};
    int ypoints[] = {j+210, j, j, j+210, j+420, j+420};
    int npoints = 6;
    graphics.drawPolygon(xpoints, ypoints, npoints);
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
