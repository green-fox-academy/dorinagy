import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject extends JComponent{
  BufferedImage image;
  int posX, posY;
  public GameObject() {

  }

  public GameObject(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
