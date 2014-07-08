import java.util.List;
import java.util.stream.Collectors;

public class StreamIterationOverStrings {

    public String listAsString(List<String> strings) {
        return strings.stream().collect(Collectors.joining(" "));
    }

    public List<String> prependToEach(List<String> strings, char c) {
        return strings.stream()
                .map(e -> c + e)
                .collect(Collectors.toList());
    }
}
