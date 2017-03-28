import sun.java2d.loops.DrawRect;
import sun.java2d.loops.FillRect;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class CheckBoard {
  public static void mainDraw(Graphics graphics){
    int x = 0;
    int y = 0;
    for (int row = 0; row < 8; row++)
      for (int col = 0; col < 8; col++) {
       if (col % 2 == 0) {
         graphics.setColor(Color.black);
         graphics.fillRect(x, y, 20,20);
         x += 40;
       }
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
