/**
 * Created by Nagy Dóra on 2017.04.10..
 */
public class EmptyTile extends Tile {
  public EmptyTile(int posX, int posY) {
    super(posX, posY);
    image = ImageLoader.getInstance().FLOOR;
  }
}
