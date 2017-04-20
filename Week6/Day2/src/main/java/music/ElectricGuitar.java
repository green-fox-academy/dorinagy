package main.java.music;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.numbersOfString = 6;
    this.name = "ElectricGuitar";
    this.sound = "Twang";
  }

  public ElectricGuitar(int numbersOfString) {
    this.numbersOfString = numbersOfString;
    this.name = "ElectricGuitar";
    this.sound = "Twang";
  }
}
