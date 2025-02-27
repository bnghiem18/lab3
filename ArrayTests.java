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
  public void testReverseInPlace2(){
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    int[] expected = {5,4,3,2,1};

    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {1,2,3,4,5};
    int[] expected = {5,4,3,2,1};

    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverageWithoutLowest(){
    double[] input1 = {1,1,1,1,1,1};
    double expected = 0;

    assertEquals(expected, ArrayExamples.averageWithoutLowest(input1),.00001);
  }

}
