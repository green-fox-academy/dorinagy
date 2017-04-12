
public class Hero extends Character {
  public Hero(int heroX, int heroY) {
    super(heroX, heroY);
    image = ImageLoader.getInstance().HERO_DOWN;
  }
}
