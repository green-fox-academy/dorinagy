/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Floor extends Tile {
  public Floor(int x, int y) {
    image = ImageLoader.getInstance().FLOOR;
    this.posX = x;
    this.posY = y;
  }
}
