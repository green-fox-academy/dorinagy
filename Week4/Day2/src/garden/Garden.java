package garden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Garden {
  List<Flower>flowers;
  List<Tree>trees;
  String color;
  double waterAmount;
  double currentWaterAmount = 0;

  public Garden() {
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    this.flowers.add(flower);
  }

  public void addTree(Tree tree) {
    this.trees.add(tree);
  }



}
