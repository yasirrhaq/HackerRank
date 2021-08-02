
import java.util.*;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int mod = 0, grade = 0, condition = 0;
        List<Integer> roundedGrades = new ArrayList<Integer>();
        if (!grades.isEmpty()) {
            for (int i = 0; i < grades.size(); i++) {
                mod = grades.get(i) % 5;
                condition = 5 - mod;
                if (grades.get(i) >= 38 && condition < 3) {
                    grade = grades.get(i) + condition;
                    roundedGrades.add(grade);
                } else {
                    grade = grades.get(i);
                    roundedGrades.add(grade);
                }
            }
        } else {
            System.out.println("There is no data!");
        }
        return roundedGrades;
    }

    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> grades = new ArrayList<Integer>();
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades.add(in.nextInt());
        }
        List<Integer> result = gradingStudents(grades);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i != result.size() - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
