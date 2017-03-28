import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class RainbowBoxes {
  public static void mainDraw(Graphics graphics){
    // create a loop that fills the canvas with rainbow colored squares.
    System.out.println("Give me the square's size and 3 numbers between 0 and 255 to the color (rgb(0, 145, 173))");
    drawSquares(graphics);

    int x, y;
    Random r = new Random();
    x = r.nextInt(640);
    y = r.nextInt(480);
    graphics.setColor(Color.GREEN);
    graphics.fillRect(x, y, 30, 30);

  }

  public static void drawSquares(Graphics drawSquare) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int r = scanner.nextInt();
    int g = scanner.nextInt();
    int b = scanner.nextInt();
    drawSquare.setColor(new Color(r, g, b));
    drawSquare.drawRect((150 - (size / 2)), (150 - (size / 2)), size, size);
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
