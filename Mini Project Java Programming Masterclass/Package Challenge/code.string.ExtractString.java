package code.string;

import java.util.HashMap;
import java.util.regex.*;

public class ExtractString {
    private static final HashMap<String, Integer> TEXT_TO_NUM = new HashMap<>();
    static {
        TEXT_TO_NUM.put("one", 1);
        TEXT_TO_NUM.put("two", 2);
        TEXT_TO_NUM.put("three", 3);
        TEXT_TO_NUM.put("four", 4);
        TEXT_TO_NUM.put("five", 5);
        TEXT_TO_NUM.put("six", 6);
        TEXT_TO_NUM.put("seven", 7);
        TEXT_TO_NUM.put("eight", 8);
        TEXT_TO_NUM.put("nine", 9);
    }

    public static String[] extractNumbers(String conversation) {
        // Extract numeric digits
        Pattern digitPattern = Pattern.compile("\\b\\d+\\b");
        Matcher digitMatcher = digitPattern.matcher(conversation);
        StringBuilder digits = new StringBuilder();
        while (digitMatcher.find()) {
            digits.append(digitMatcher.group()).append(",");
        }

        // Extract text numbers and calculate sum
        int textSum = 0;
        for (String word : TEXT_TO_NUM.keySet()) {
            if (conversation.toLowerCase().contains(word)) {
                textSum += TEXT_TO_NUM.get(word);
            }
        }

        return new String[]{digits.toString(), String.valueOf(textSum)};
    }
}
