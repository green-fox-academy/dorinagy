import java.util.*;

/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public void add() {
    sharpies.add(new Sharpie("blue", 2));
    sharpies.add(new Sharpie("pink", 6));
    sharpies.add(new Sharpie("black", 5));
    sharpies.add(new Sharpie("yellow", 7));
  }

  public int countUseable() {
    int counter = 0;
    for(int i = 0; i < sharpies.size(); i++) {
      if(sharpies.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

    public void removeTrash() {
      for(int i = 0; i <sharpies.size(); i++) {
        if(sharpies.get(i).inkAmount == 0) {
          sharpies.remove(i);
        }
      }
    }

  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add();
    sharpieSet.countUseable();
    sharpieSet.removeTrash();
    System.out.println(sharpieSet.countUseable());
    System.out.println(sharpieSet.sharpies);
  }
}