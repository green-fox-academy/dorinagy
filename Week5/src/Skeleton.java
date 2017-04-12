
/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Skeleton extends Monster {
  public Skeleton() {
    int x = (int) (Math.random() * 9);
    int y = (int) (Math.random() * 9);
    while(Area.isWall(x, y)) {
      x = (int) (Math.random() * 9);
      y = (int) (Math.random() * 9);
    }
    image = ImageLoader.getInstance().SKELETON;
    posX = x;
    posY = y;
  }
}
