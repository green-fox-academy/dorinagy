package main.java.music;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class Violin extends StringedInstrument {
  public Violin() {
    this.numbersOfString = 4;
    this.name = "Violin";
    this.sound = "Screech";
  }

  public Violin(int numbersOfString) {
    this.numbersOfString = numbersOfString;
    this.name = "Violin";
    this.sound = "Screech";
  }
}
