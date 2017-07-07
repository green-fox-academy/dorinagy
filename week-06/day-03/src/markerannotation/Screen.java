package markerannotation;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
@Monitor(aspectratio = "4:3", classification = "TFT")
public class Screen {
  int width, height;

  public Screen(int width, int height) {
    this.width = width;
    this.height = height;
  }
}
