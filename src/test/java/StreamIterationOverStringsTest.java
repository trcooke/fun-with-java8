import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class StreamIterationOverStringsTest {

    private StreamIterationOverStrings classUnderTest = new StreamIterationOverStrings();

    @Test public void listAsString() {
        assertThat(classUnderTest.listAsString(Arrays.asList("1", "2")), is("1 2"));
    }

    @Test public void prependCharToEachString() {
        assertThat(classUnderTest.prependToEach(Arrays.asList("1", "2"), 'a'), is(Arrays.asList("a1", "a2")));
    }

    @Test public void mapOfCharOccurrence() {
        assertThat(classUnderTest.charOccurrences("aabb"), is(ImmutableMap.of('a', 2, 'b', 2)));
    }
}
