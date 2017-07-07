import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.05.11..
 */
class KataTest {

  @Test
  public void TestIfAnagramOne() {
    assertEquals(true, Kata.isAnagram("alma", "mlaa"));
  }

  @Test
  public void TestIfAnagramTwo() {
    assertEquals(false, Kata.isAnagram("alma", "korte"));
  }

  @Test
  public void TestIfAnagramThree() {
    assertEquals(false, Kata.isAnagram("alma", "dfkl"));
  }

  @Test
  public void TestIfAnagramFour() {
    assertEquals(false, Kata.isAnagram("klhn", "dfal"));
  }

  @Test
  public void TestIfAnagramFive() {
    assertEquals(false, Kata.isAnagram("jaammmfjsklgm", "jaakldfjsklgm"));
  }

  @Test
  public void TestIfAnagramSix() {
    assertEquals(true, Kata.isAnagram("jkkkldfjsklgm", "jkkkldfjsklgm"));
  }

  @Test
  public void TestIfAnagramSeven() {
    assertEquals(true, Kata.isAnagram("34 patrik dori 43", "34 PATRIKDori 43"));
  }

  @Test
  public void TestIfAnagramEight() {
    assertEquals(true, Kata.isAnagram(null, null));
  }

  @Test
  public void TestIfAnagramNine() {
    assertEquals(false, Kata.isAnagram("34 patrik dori 43" + null, "34 PATRIKDori 43"));
  }

  @Test
  public void TestFizzBuzzOne() {
    assertEquals("Fizz", Kata.FizzBuzz(3));
  }

  @Test
  public void TestFizzBuzzTwo() {
    assertEquals("FizzBuzz", Kata.FizzBuzz(90));
  }

}