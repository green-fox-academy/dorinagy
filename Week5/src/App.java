import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class App extends JComponent implements KeyListener {
  final static int MAP_SIZE = 720;
  final static int TILE_NUM = 10;
  final static int HUD = 100;
  static ArrayList<Monster> monsterMap;
  Area area;
  Hero hero;
  Boss boss;
  Hud hud;
  Skeleton skeleton;

  public App() {
    monsterMap = new ArrayList<>();
    setPreferredSize(new Dimension(MAP_SIZE, MAP_SIZE + HUD));
    setVisible(true);
    area = new Area();
    hud = new Hud();
    hero = new Hero();
    boss = new Boss();
    monsterMap.add(boss);
    for(int i = 0; i < 3; i++) {
      skeleton = new Skeleton();
      monsterMap.add(skeleton);
    }
  }

  public void drawMonsterMap(Graphics graphics) {
    for(int i = 0; i < monsterMap.size(); i++) {
      monsterMap.get(i).draw(graphics);
    }
  }

  public void drawHud(Graphics graphics) {
    hud.draw(graphics, 340, MAP_SIZE + 20);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    area.drawArea(graphics);
    drawMonsterMap(graphics);
    hero.draw(graphics);
    drawHud(graphics);
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
        hero.posY--;
      }
      hero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (hero.posY < TILE_NUM - 1 && !area.isWall(hero.posX, hero.posY + 1)) {
        hero.posY++;
      }
      hero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (hero.posX > 0 && !area.isWall(hero.posX - 1, hero.posY)) {
        hero.posX--;
      }
      hero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (hero.posX < TILE_NUM - 1 && !area.isWall(hero.posX + 1, hero.posY)) {
        hero.posX++;
      }
      hero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
    invalidate();
    repaint();
  }
}
