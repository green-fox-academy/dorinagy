import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Area extends GameObject implements KeyListener {
  ArrayList<Tile> wallMap;
  int heroX;
  int heroY;
  int size = 720;
  String filename = "assets/hero-down.png";

  public Area() {
    wallMap = new ArrayList<>();
    heroX = 0;
    heroY = 0;
    setPreferredSize(new Dimension(size, size));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        EmptyTile floor = new EmptyTile(i * 72, j * 72);
        floor.draw(graphics);
      }
    }

    for (int i = 1; i < 10; i += 2) {
      for (int j = 0; j < 10; j++) {
        if (j % 3 == 0) {

        } else {
          NotEmptyTile wall = new NotEmptyTile(i * 72, j * 72);
          wallMap.add(wall);
          wall.draw(graphics);
        }
      }
    }

    Hero hero = new Hero(filename, heroX, heroY);
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
    int currentX = heroX;
    int currentY = heroY;
    if (e.getKeyCode() == KeyEvent.VK_UP && heroY > 0) {
      if (!isWall(currentX, currentY - 72)) {
        heroY -= 72;
        filename = "assets/hero-up.png";
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY < size - 72) {
      if (!isWall(currentX, currentY + 72)) {
        heroY += 72;
        filename = "assets/hero-down.png";
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX > 0) {
      if (!isWall(currentX - 72, currentY)) {
        heroX -= 72;
        filename = "assets/hero-left.png";
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX < size - 72) {
      if (!isWall(currentX + 72, currentY)) {
        heroX += 72;
        filename = "assets/hero-right.png";
      }
    } else {
    }
    repaint();
  }

  public boolean isWall(int toHereX, int toHereY) {
    for (int i = 0; i < wallMap.size(); i++) {
      if (toHereX == wallMap.get(i).posX && toHereY == wallMap.get(i).posY) {
        return true;
      }
    }
    return false;
  }
}
