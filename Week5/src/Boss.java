/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Boss extends Monster {
  int x = (int) (Math.random() * 9);
  int y = (int) (Math.random() * 9);

  public Boss() {
    image = ImageLoader.getInstance().BOSS;
    posX = x;
    posY = y;
  }
}
