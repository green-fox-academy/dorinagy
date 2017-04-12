
public class Hero extends Character {
  public Hero(int heroX, int heroY) {
    super(ImageLoader.getInstance().HERO_DOWN, heroX, heroY);
  }

  public void moveUp() {
    this.posY -= 72;
    setImage(ImageLoader.getInstance().HERO_UP);
  }
  public void moveDown() {
    this.posY += 72;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  public void moveLeft() {
    this.posX -= 72;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  public void moveRight() {
    this.posX += 72;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }
}
