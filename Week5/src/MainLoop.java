import javax.swing.*;

public class MainLoop {
  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Area area = new Area();
    frame.add(area);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(area);
  }
}
