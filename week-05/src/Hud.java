import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.04.13..
 */
public class Hud {
  String heroStatus;
  Hero hero;

  public Hud() {
    hero = new Hero();
    heroStatus = "Hero (Level 1) HP: " + hero.currentHP + "/" + hero.maxHP + " | DP: " + hero.DP + " | SP: " + hero.SP;
  }

  public void draw(Graphics graphics, int x, int y) {
    graphics.drawString(heroStatus, x, y);
  }
}
