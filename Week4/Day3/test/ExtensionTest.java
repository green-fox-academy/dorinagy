import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class ExtensionTest {
  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_4and6is10() {
    assertEquals(10, extension.add(4, 6));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_mine() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_mine() {
    assertEquals(3, extension.median(Arrays.asList(7,3,5,3,3,3)));
  }

  @Test
  void testMedian_mine2() {
    assertEquals(4, extension.median(Arrays.asList(1,2,3,4,6,6,7)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_mine() {
    assertEquals("mevegeveszevem", extension.translate("megeszem"));
  }
}