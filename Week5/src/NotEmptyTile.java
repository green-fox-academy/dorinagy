/**
 * Created by Nagy Dóra on 2017.04.10..
 */
public class NotEmptyTile extends Tile {
  public NotEmptyTile(int posX, int posY) {
    super(posX, posY);
    image = ImageLoader.getInstance().WALL;
  }
}
