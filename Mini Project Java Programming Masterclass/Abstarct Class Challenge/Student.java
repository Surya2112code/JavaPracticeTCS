//import java.text.DecimalFormat;

abstract class Student {


    public abstract void result(String MarksOfStudent);

    protected double calculateGradePoint(int marks) {
        //double firstdiff = (100-75)*11/26;
        //double seconddiff = (75-60)/10;
        //double thirddiff = (60-50)/10;
        //double fourthdiff = (50-40)/10;
        //DecimalFormat df = new DecimalFormat("#.#");
        if (marks >= 75 && marks <= 100) {
            // 75-100 (26 numbers) maps to 9.0-10.0 (11 values)
            // Each 0.1 grade point increase corresponds to 26/10 = 2.6 marks
            double grade = 9.0 + (marks - 75) * (1.0 /25);
            return Math.round(grade*10.0)/10.0;
        } else if (marks >= 60 && marks <= 74) {
            // 60-74 (15 numbers) maps to 8.0-8.9 (9 values)
            // Each 0.1 grade point increase corresponds to 15/8 = 1.875 marks
            double grade = 8.0 + (marks - 60) * (0.9/15);
            return Math.round(grade*10.0)/10.0;
        } else if (marks >= 50 && marks <= 59) {
            // 50-59 (10 numbers) maps to 7.0-7.9 (9 values)
            // Each 0.1 grade point increase corresponds to 10/8 = 1.25 marks
            double grade = 7.0 + (marks - 50) * (0.9/9);
            return Math.round(grade*10.0)/10.0;
        } else if (marks >= 40 && marks <= 49) {
            // 40-49 (10 numbers) maps to 6.0-6.9 (9 values)
            // Each 0.1 grade point increase corresponds to 10/8 = 1.25 marks
            double grade = 6.0 + (marks - 40) * (0.9/9);
            return Math.round(grade*10.0)/10.0;
        } else {
            return 0.0;
        }
    }
}
