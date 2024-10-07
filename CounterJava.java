import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterJava {
    public static <T> Map<T, Integer> countElements(List<T> list) {
        Map<T, Integer> elementCountMap = new HashMap<>();
        for (T element : list) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }
        return elementCountMap;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(list);
        System.out.println(result);
    }
}
