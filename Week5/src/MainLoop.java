import javax.swing.*;

public class MainLoop {
  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    App app = new App();
    frame.add(app);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(app);
  }
}
