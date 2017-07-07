/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class UrlFixer {
  public static void main(String...args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String replacedUrl = url.replace("bots", "odds");

    String firstPart = replacedUrl.substring(0, 5);
    String secondPart = replacedUrl.substring(5);

    System.out.println(firstPart + ":" + secondPart);
  }
}
