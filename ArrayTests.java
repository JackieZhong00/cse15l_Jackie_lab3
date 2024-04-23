import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceResult(){
    int[] input = {1,2,3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3,2,1}, input);
  }

  @Test
  public void testReversedResult(){
    int[] input = {1,2,3};
    int[] expected = {3,2,1};
    assertArrayEquals(expected, ArrayExamples.reversed(input));
  }
}
