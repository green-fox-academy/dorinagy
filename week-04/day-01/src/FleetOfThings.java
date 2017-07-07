/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing getMilk = new Thing("Get milk");
    Thing removeobsticles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Eat lunch");

    standUp.complete();
    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(removeobsticles);
    fleet.add(standUp);
    fleet.add(eatLunch);

    System.out.println(fleet);
  }
}
