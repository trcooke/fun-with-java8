import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;

public class StreamIterationOverStrings {

    public String listAsString(List<String> strings) {
        return strings.stream().collect(Collectors.joining(" "));
    }

    public List<String> prependToEach(List<String> strings, char c) {
        return strings.stream()
                .map(e -> c + e)
                .collect(Collectors.toList());
    }

    public Map<Character, Integer> charOccurrences(String s) {
        return s.chars().collect(
                HashMap::new,
                (m, c) -> m.merge((char) c, 1, Integer::sum),
                HashMap::putAll);
    }
}
