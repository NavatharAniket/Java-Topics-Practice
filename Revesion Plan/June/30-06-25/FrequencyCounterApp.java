import java.util.*;
interface FrequencyCounter {
    void countFrequency(int[] arr);
}

class FrequencyAnalyzer implements FrequencyCounter {

    @Override
    public void countFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            System.out.println("Number " + number + " occurs " + count + (count > 1 ? " times" : " time"));
        }
    }
}

public class FrequencyCounterApp {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 5, 1, 1};

        FrequencyAnalyzer analyzer = new FrequencyAnalyzer();
        analyzer.countFrequency(arr);
    }
}


