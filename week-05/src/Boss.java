/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Boss extends Monster {

  public Boss() {
    int x = (int) (Math.random() * 9);
    int y = (int) (Math.random() * 9);
    while (Area.isWall(x, y) || !Area.isEmpty(x, y)) {
      x = (int) (Math.random() * 9);
      y = (int) (Math.random() * 9);
    }
    image = ImageLoader.getInstance().BOSS;
    posX = x;
    posY = y;
    DiceRoll.rollTheDice(d6);
    maxHP = 2 * level * d6 + d6;
    DP = level / 2 * d6 + d6 / 2;
    SP = level * d6 + level;
  }
}
