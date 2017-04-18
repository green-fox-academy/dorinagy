package main.java.music;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public abstract class StringedInstrument extends Instrument {
  int numbersOfString;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

  public void play() {
    System.out.printf(formatForPlay, name, numbersOfString, sound);
  }
}