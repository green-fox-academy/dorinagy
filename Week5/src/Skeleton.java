
/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Skeleton extends Monster {
  int x = (int) (Math.random() * 9);
  int y = (int) (Math.random() * 9);

  public Skeleton() {
    image = ImageLoader.getInstance().SKELETON;
    posX = x;
    posY = y;
  }
}
