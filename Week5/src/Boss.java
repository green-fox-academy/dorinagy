/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Boss extends Monster {

  public Boss() {
    int x = (int) (Math.random() * 9);
    int y = (int) (Math.random() * 9);
    while(Area.isWall(x, y) && !Area.isEmpty(x, y)) {
      x = (int) (Math.random() * 9);
      y = (int) (Math.random() * 9);
    }
    image = ImageLoader.getInstance().BOSS;
    posX = x;
    posY = y;
  }
}
