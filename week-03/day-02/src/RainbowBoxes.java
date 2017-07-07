import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class RainbowBoxes {
  public static void mainDraw(Graphics graphics){
    System.out.println("Give me the square's size and 3 numbers between 0 and 255 to the color (rgb(0, 145, 173))");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int r = scanner.nextInt();
    int g = scanner.nextInt();
    int b = scanner.nextInt();
    int y = 300;
    for (int i = 300; i < size;) {
      Random rand = new Random();
      int n = rand.nextInt(255);
      int n1 = rand.nextInt(255);
      int n2 = rand.nextInt(255);
      graphics.setColor(new Color(n,n1,n2));
      graphics.fillRect(300-i, 300-i, y, y);
      i = i -10;
      y = y - (2*10);
    }
    graphics.setColor(new Color(r, g, b));
    graphics.fillRect((150 - (size / 2)), (150 - (size / 2)), size, size);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 340));
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
