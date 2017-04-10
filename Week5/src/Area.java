import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Area extends GameObject implements KeyListener{
  int testBoxX;
  int testBoxY;
  int posX;
  int posY;
  String filename = "assets/hero-down.png";

  public Area() {
    testBoxX = 0;
    testBoxY = 0;
    posX = 0;
    posY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        EmptyTile emptyTile = new EmptyTile(i * 72, j * 72);
        emptyTile.draw(graphics);
      }
    }

    for(int i = 1; i < 10; i+=2) {
      for(int j = 0; j < 10; j++) {
        if(j % 3 == 0) {

        } else {
        NotEmptyTile wall = new NotEmptyTile(i * 72, j * 72);
        wall.draw(graphics);
        }
      }
    }
    Hero hero = new Hero(filename, testBoxX, testBoxY);
    hero.draw(graphics);
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
      testBoxY -= 72;
      filename = "assets/hero-up.png";
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
      filename = "assets/hero-down.png";
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 72;
      filename = "assets/hero-left.png";
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 72;
      filename = "assets/hero-right.png";
    }
    repaint();
  }
}
