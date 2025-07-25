//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Aided aided = new Aided();
        SelfFinance self = new SelfFinance();


        String allMarks1="100 5,100 2,100 5|0,100,5|1,100,5";
        String allMarks2="67 4,34 2,54 5,100 2|1,100,5|0,100,5";
        String allMarks3="100 5,100 5,100 5|0,100,5|1,100,5";
        String allMarks4="100 5,100 2,56 5|1,100,5";
        String allMarks5="100 5,100 2,46 5|1,100,5";
        String allMarks6="100 5,100 5,100 5,76 3|0,100,5";
       String allMarks7="100 5,100 5,100 5|0,100,5";
        String allMarks8="100 5,100 5,53 5,76 3|0,100,5";

        //String[] parts = allMarks1.split("\\|");
        for(String part:parts){
            System.out.println(part);
        }
        String[] subjectPairs = parts[0].split(",");
        for(String part:subjectPairs){
            System.out.println(part);
        }

        for (String pair : subjectPairs) {
            String[] markCredit = pair.split(" ");
            int marks = Integer.parseInt(markCredit[0]);
            int credit = Integer.parseInt(markCredit[1]);
            System.out.println(marks);
            System.out.println(credit);
        }
        //String results = self.result(allMarks7);
        //System.out.println(results.hashCode());
        //String results1 = self.result(allMarks8);
        //self.result(allMarks7);
        //self.result(allMarks8);
        //self.result(allMarks7);
        //self.result(allMarks6);
        //self.result(allMarks5);
        //self.result(allMarks4);
        //aided.result(allMarks3);
        aided.result(allMarks2);
        //aided.result(allMarks1);



    }
}
