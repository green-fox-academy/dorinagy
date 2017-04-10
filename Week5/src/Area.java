import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Area extends GameObject implements KeyListener{
  int testBoxX;
  int testBoxY;

  public Area() {
    testBoxX = 0;
    testBoxY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Tile image = new Tile("assets/floor.png", 0, 0);
    image.draw(graphics);
  }
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 100;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 100;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 100;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 100;
    }
    repaint();
  }
}
