import java.util.LinkedHashMap;
import java.util.Map;

class CharData {
    String str = "programming";
}

class CharFrequency extends CharData {
    void printFrequency() {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

class FirstUniqueChar extends CharData {
    void findFirstNonRepeating() {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First Non-Repeating Character → " + c);
                return;
            }
        }
        System.out.println("No Non-Repeating Character Found");
    }
}
