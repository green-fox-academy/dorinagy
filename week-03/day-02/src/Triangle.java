import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.04.02..
 */
public class Triangle {
  public static void mainDraw(Graphics graphics) {
    int centerX = 150;
    int centerY = 0;
    int side = 20;
    int rows = 15;
    int sideHalf = side /2;
    Double sideDouble = side*Math.sqrt(3)/2;
    int triangleHeight = sideDouble.intValue();
    for (int i = 1; i < rows+1; i++) {
      graphics.drawLine(centerX+sideHalf*i, centerY+triangleHeight*i, centerX-sideHalf*i,centerY+triangleHeight*i);
      graphics.drawLine(centerX-sideHalf*(i-1), centerY+triangleHeight*(i-1), centerX+sideHalf*rows-side*(i-1),centerY+triangleHeight*rows);
      graphics.drawLine(centerX+sideHalf*(i-1), centerY+triangleHeight*(i-1), centerX-sideHalf*rows+side*(i-1),centerY+triangleHeight*rows);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 320));
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
