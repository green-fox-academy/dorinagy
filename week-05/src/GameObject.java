import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {
  final static int SIZE = 72;
  BufferedImage image;
  int posX, posY;

  public GameObject() {

  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * SIZE, posY * SIZE, null);
    }
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }
}
