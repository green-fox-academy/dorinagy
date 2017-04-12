import java.util.ArrayList;

public class Character extends GameObject{
  int maxHP, currentHp, DP, SP;
  static ArrayList<Character> characterList = new ArrayList<>();

  public Character() {
  }

  public Character(int posX, int posY) {
    super(posX, posY);
    characterList.add(this);
  }
}
