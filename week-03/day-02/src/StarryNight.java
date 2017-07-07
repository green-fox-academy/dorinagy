import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Nagy Dóra on 2017.04.02..
 */
public class StarryNight {
  final public static int SCREENSIZE = 300;
  final public static int STARSIZE = 2;
  final public static int MINSTARS = 50;
  final public static int MAXSTARS = 150;

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 300, 300);
    int numberOfStars = numberOfStars(graphics);
    for (int i = 0; i < numberOfStars; i++) {
      generateRandomColor(graphics);
      int x = randomNumber(graphics);
      int y = randomNumber(graphics);
      graphics.fillRect(x, y, STARSIZE, STARSIZE);
    }

  }

  public static int numberOfStars(Graphics stars) {
    Random randomNrStars = new Random();
    int star = randomNrStars.nextInt(MAXSTARS - MINSTARS + 1) + MINSTARS;
    return star;
  }

  public static int randomNumber(Graphics random) {
    Random randomNumber = new Random();
    int r = randomNumber.nextInt(SCREENSIZE - STARSIZE + 1) + STARSIZE;
    return r;
  }
  public static void generateRandomColor(Graphics graphics2) {
    Random rand = new Random();
    int n = rand.nextInt(220 - 120 + 1) + 120;
    graphics2.setColor(new Color(n, n, n));
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
