import java.text.DecimalFormat;

public class Aided extends Student  {


    @Override
    public void result(String MarksOfStudent) {
        String[] parts = MarksOfStudent.split("\\|");

        // Process subject marks
        String[] subjectPairs = parts[0].split(",");
        double numerator = 0.0;
        double denominator = 0.0;

        for (String pair : subjectPairs) {
            String[] markCredit = pair.split(" ");
            int marks = Integer.parseInt(markCredit[0]);
            int credit = Integer.parseInt(markCredit[1]);
            System.out.println("marks before adding values"+marks);
            double gradePoint = calculateGradePoint(marks);
            System.out.println("gradepoint before adding values"+gradePoint);
            System.out.println("Value of Numerator before adding values"+numerator);
            numerator += gradePoint * credit;
            System.out.println("Value of Numerator after adding values"+numerator);
            denominator += 5; // maximum credit is always 5
        }
        System.out.println("Value of Numerator before NCC"+numerator);
        // Process NCC marks if available
        if (parts.length > 1 && !parts[1].isEmpty()) {
            String[] nccParts = parts[1].split(",");
            int nccInvolved = Integer.parseInt(nccParts[0]);
            if (nccInvolved == 1) {
                int nccMarks = Integer.parseInt(nccParts[1]);
                int nccCredit = Integer.parseInt(nccParts[2]);
                double nccGradePoint = calculateGradePoint(nccMarks);
                numerator += nccGradePoint * nccCredit;
                denominator += 5;
            }
        }
        System.out.println("Value of Numerator before Sports"+numerator);
        // Process Sports marks if available
        if (parts.length > 2 && !parts[2].isEmpty()) {
            String[] sportsParts = parts[2].split(",");
            int sportsInvolved = Integer.parseInt(sportsParts[0]);
            if (sportsInvolved == 1) {
                int sportsMarks = Integer.parseInt(sportsParts[1]);
                int sportsCredit = Integer.parseInt(sportsParts[2]);
                double sportsGradePoint = calculateGradePoint(sportsMarks);
                numerator += sportsGradePoint * sportsCredit;
                denominator += 5;
            }
        }

        double cgpa = numerator / denominator;
        DecimalFormat df = new DecimalFormat("0.00");
        //return df.format(cgpa);
        String endResults = df.format(cgpa);
        System.out.println("Value of End Results"+endResults);
        System.out.println("Value of Numerator"+numerator);
        System.out.println("Value of Denominator"+denominator);
        System.out.println("Value of End Results hashcode "+endResults.hashCode());

    }
}
