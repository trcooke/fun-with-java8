import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StreamIterationOverIntsTest {
    StreamIterationOverInts streamIterationOverInts = new StreamIterationOverInts();

    @Test public void filterOverTen() {
        assertThat(streamIterationOverInts.filterOver(10, Arrays.asList(7,8,9,10,11,12)), is(Arrays.asList(7,8,9,10)));
    }
}
