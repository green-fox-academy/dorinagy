import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.28..
 */
public class ConnectDots {
  public static void mainDraw(Graphics graphics){
    System.out.println("Type in two points!");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int[] inputArray = new int[]{x,y};
    graphics.setColor(Color.GREEN);
    connectDots(graphics, inputArray);
    int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] fox = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    connectDots2(graphics, box);
    connectDots2(graphics, fox);
  }

  public static void connectDots(Graphics graphics, int[] input) {
    graphics.drawLine(input[0], 0, 0, input[1]);
  }

  public static void connectDots2(Graphics graphics, int[][] coordinates) {
    int[] xpoints = new int[coordinates.length];
    int[] ypoints = new int[coordinates.length];
    int npoints = coordinates.length;
    for(int i = 0; i < coordinates.length; i++) {
      xpoints[i] = coordinates[i][0];
      ypoints[i] = coordinates[i][1];
    }
    graphics.drawPolygon(xpoints, ypoints, npoints);
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
