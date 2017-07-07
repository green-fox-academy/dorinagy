import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class AppendLetter {
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    ArrayList<String> far2 = new ArrayList<String>(Arrays.asList());
    int length = far.size();
    for (int i = 0; i < length; i++ ){
      far2.add(far.get(i) + "a");
    }
    System.out.println(far2);
  }
}
