import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static List<Comparable> sort(List<Comparable> input) {
        try {
            int size = input.size();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        int size = input.size();
        int remove = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (input.get(j) == null) {
                    for (int k = j; k < size - 1; k++) {
                        input.set(k, input.get(k + 1));
                        remove++;
                    }
                    continue;
                }
                if ((((Number) input.get(j)).doubleValue()) > (((Number) input.get(j + 1)).doubleValue())) {
                    Comparable temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
        List<Comparable> output = new ArrayList<>();
        for (int i = 0; i < size - remove; i++) {
            output.add(input.get(i));
        }
        return output;
    }


}
