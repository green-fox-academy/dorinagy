import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void returnsMaxOfSencondElements() {
    int[] inputArray = {1, 3, 8, 6, 7, 4};
    assertEquals(6, Main.getBiggestOfSecondElements(inputArray));
  }
}