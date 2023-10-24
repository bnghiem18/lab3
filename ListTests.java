import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

    // @Test
    // public void filterTest(){
    //     List<String> input1 = new ArrayList<>();
    //     String random = "hi";
    //     String random2 = "hello";
    //     String random3 = "bye";
    //     input1.add(random);
    //     input1.add(random2);
    //     input1.add(random3);

    //     List<String> expected = new ArrayList<>();
    //     expected.add(random);
    //     expected.add(random2);
    //     expected.add(random3);

    //     StringChecker sc;

    //     ListExamples.filter(input1,sc);

    //     for (int i = 0; i<input1.size(); i++){
    //         assertEquals(expected.get(i), input1.get(i));
    //     }

    // }

    @Test
    public void mergeTest(){
        List<String> input1 = new ArrayList<>();
        String random = "a";
        String random2 = "b";
        String random3 = "c";
        input1.add(random);
        input1.add(random2);
        input1.add(random3);

        List<String> input2 = new ArrayList<>();
        input2.add(random2);
        input2.add(random2);
        input2.add(random3);

        List<String> expected = new ArrayList<>();
        expected.add(random);
        expected.add(random2);
        expected.add(random3);
        expected.add(random2);
        expected.add(random2);
        expected.add(random3);

        List<String> merged = ListExamples.merge(input1, input2);

        String[] expectedArr = new String[expected.size()];
        for (int i = 0; i<expected.size(); i++){
            expectedArr[i] = expected.get(i);
        }

        String[] mergedArr = new String[merged.size()];
        for( int i = 0; i<merged.size(); i++){
            mergedArr[i] = merged.get(i);
        }
       


    }
}
