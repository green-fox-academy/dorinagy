package main.java.music;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.numbersOfString = 4;
    this.name = "BassGuitar";
    this.sound = "Duum-duum-duum";
  }

  public BassGuitar(int numbersOfString) {
    this.numbersOfString = numbersOfString;
    this.name = "BassGuitar";
    this.sound = "Duum-duum-duum";
  }
}
