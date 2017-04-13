
public class Hero extends Character {
  public Hero() {
    image = ImageLoader.getInstance().HERO_DOWN;
    posX = 0;
    posY = 0;
    DiceRoll.rollTheDice(d6);
    maxHP = 20 + 3 * d6;
    DP = 2 * d6;
    SP = 5 + d6;
  }
}
