import java.util.List;
import java.util.stream.Collectors;

public class StreamIterationOverInts {

    public List<Integer> filterOver(int x, List<Integer> integers) {
        return integers.stream()
                .filter(y -> y <= x)
                .collect(Collectors.toList());
    }
}
