

package code.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberFinder {
    public static boolean isKeithComposite(int n) {
        if (isPrime(n)) return false;
        
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }
        
        int len = digits.size();
        List<Integer> sequence = new ArrayList<>(digits);
        
        while (true) {
            int next = 0;
            for (int i = sequence.size() - len; i < sequence.size(); i++) {
                next += sequence.get(i);
            }
            
            if (next == n) return true;
            if (next > n) return false;
            
            sequence.add(next);
        }
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static String filterKeithComposites(String[] numbers) {
        StringBuilder result = new StringBuilder();
        String[] nums = numbers[0].split(",");
        for (String numStr : nums) {
            if (!numStr.isEmpty()) {
                int num = Integer.parseInt(numStr);
                if (isKeithComposite(num)) {
                    result.append(num);
                }
            }
        }
        result.append(numbers[1]);
        return result.toString();
    }
}
