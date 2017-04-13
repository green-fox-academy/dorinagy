
public class Hero extends Character {
  public Hero() {
    image = ImageLoader.getInstance().HERO_DOWN;
    posX = 0;
    posY = 0;
    maxHP = 20 + 3 * DiceRoll.rollTheDice();
    DP = 2 * DiceRoll.rollTheDice();
    SP = 5 + DiceRoll.rollTheDice();
  }
}
