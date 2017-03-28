import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class CenteredBoxes {
  public static void mainDraw(Graphics graphics) {
    System.out.println("Give me the square's size!");
    drawSquares(graphics);
    System.out.println("Give me the square's size!");
    drawSquares(graphics);
    System.out.println("Give me the square's size!");
    drawSquares(graphics);

  }

  public static void drawSquares(Graphics drawSquare) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    drawSquare.setColor(Color.BLUE);
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
