import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class RainbowBoxes {
  public static void mainDraw(Graphics graphics){
    // create a loop that fills the canvas with rainbow colored squares.
    System.out.println("Give me the square's size and the color!");
    drawSquares(graphics);
  }

  public static void drawSquares(Graphics drawSquare) {
    Scanner scanner = new Scanner(System.in);
    String color = scanner.nextLine();
    drawSquare.setColor(Color.getColor(color));
    int size = scanner.nextInt();
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
