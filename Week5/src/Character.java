import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends GameObject{
  int maxHP, currentHp, DP, SP;
  static ArrayList<Character> characterList = new ArrayList<>();

  public Character() {
  }

  public Character(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
    characterList.add(this);
  }
}
