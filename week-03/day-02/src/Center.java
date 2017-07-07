import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class Center {
  public static void mainDraw(Graphics graphics){

    System.out.println("Give me two parameters!");
    drawLines(graphics);

    for (int x = 0; x <= 300; x += 20) {
      graphics.drawLine(x,0,150,150);
    }
    for (int x = 0; x <= 300; x += 20) {
      graphics.drawLine(x,300,150,150);
    }
    for (int y = 20; y < 300; y += 20) {
      graphics.drawLine(0,y,150,150);
    }
    for (int y = 20; y < 300; y += 20) {
      graphics.drawLine(300,y,150,150);
    }

  }
  public static void drawLines(Graphics drawLine) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    drawLine.setColor(Color.BLUE);
    drawLine.drawLine(x, y, 150, 150);
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
