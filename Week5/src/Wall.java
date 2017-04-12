/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Wall extends Tile{
  public Wall(int x, int y) {
    image = ImageLoader.getInstance().WALL;
    this.posX = x;
    this.posY = y;
  }
}
