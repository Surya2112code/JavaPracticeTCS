package code;

import code.numbers.NumberFinder;
import code.string.ExtractString;

public class KeithClass {
    public String getInput(String conversation) {
        // Step 1: Extract numbers from string
        String[] extractedNumbers = ExtractString.extractNumbers(conversation);
        
        // Step 2: Filter Keith composite numbers and concatenate with text sum
        String secretCode = NumberFinder.filterKeithComposites(extractedNumbers);
        
        return secretCode;
    }
}
