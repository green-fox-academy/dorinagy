import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class App extends JComponent implements KeyListener {
  final static int MAP_SIZE = 720;
  final static int mapTiles = 10;
  Area area;
  Hero hero;
  Boss boss;
  Skeleton skeleton1, skeleton2, skeleton3;

  public App() {
    setPreferredSize(new Dimension(MAP_SIZE, MAP_SIZE));
    setVisible(true);
    area = new Area();
    hero = new Hero();
    boss = new Boss();
    skeleton1 = new Skeleton();
    skeleton2 = new Skeleton();
    skeleton3 = new Skeleton();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    area.drawArea(graphics);
    boss.draw(graphics);
    skeleton1.draw(graphics);
    skeleton2.draw(graphics);
    skeleton3.draw(graphics);
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
      if (hero.posY > 0 && !area.isWall(hero.posX, hero.posY - 1)) {
        hero.posY --;
      }
      hero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (hero.posY < mapTiles - 1 && !area.isWall(hero.posX, hero.posY + 1)) {
        hero.posY ++;
      }
      hero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (hero.posX > 0 && !area.isWall(hero.posX - 1, hero.posY)) {
        hero.posX --;
      }
      hero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (hero.posX < mapTiles - 1 && !area.isWall(hero.posX + 1, hero.posY)) {
        hero.posX ++;
      }
      hero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
    invalidate();
    repaint();
  }
}
