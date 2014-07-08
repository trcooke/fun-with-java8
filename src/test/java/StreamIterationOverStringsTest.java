import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StreamIterationOverStringsTest {
    @Test public void listAsString() {
        StreamIterationOverStrings classUnderTest = new StreamIterationOverStrings();
        assertThat(classUnderTest.listAsString(Arrays.asList("1", "2")), is("1 2"));
    }

    @Test public void prependCharToEachString() {
        StreamIterationOverStrings classUnderTest = new StreamIterationOverStrings();
        assertThat(classUnderTest.prependToEach(Arrays.asList("1", "2"), 'a'), is(Arrays.asList("a1", "a2")));
    }
}
