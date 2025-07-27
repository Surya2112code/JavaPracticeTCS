public class Main {
    public static void main(String[] args) {
        KeithClass kc = new KeithClass();
        String conversation = "A: Hello, Priya 3 speaking, Is this Aditi? B: Yeah Priya! I am there 28. " +
                             "A: How are you dear ? B: I am fine 19. What about you Priya 75? " +
                             "A: Glad to hear that! Me too fine! seven. Aditi how are your five holidays going? " +
                             "B: Great Priya! I am enjoying well!";
        
        System.out.println(kc.getInput(conversation)); // Output: 287512
    }
}
