import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Colors {
  public static void main(String[] args) {
    String[][] color = new String[3][5];
    color[0][0] = "lime";
    color[0][1] = "forest green";
    color[0][2] = "olive";
    color[0][3] = "pale green";
    color[0][4] = "spring green";
    color[1][0] = "orange red";
    color[1][1] = "red";
    color[1][2] = "tomato";
    color[1][0] = "orchid";
    color[2][0] = "violet";
    color[2][1] = "pink";
    color[2][2] = "hot pink";
    System.out.println(Arrays.toString(color[0]));
    System.out.println(Arrays.toString(color[1]));
    System.out.println(Arrays.toString(color[2]));
  }
}
