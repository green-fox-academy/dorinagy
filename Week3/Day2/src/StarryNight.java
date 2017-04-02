import javax.swing.*;
import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.04.02..
 */
public class StarryNight {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 300, 300);

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
