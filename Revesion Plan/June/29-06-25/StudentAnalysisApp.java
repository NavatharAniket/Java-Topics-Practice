import java.util.Scanner;

// Abstract class
abstract class StudentAnalyzer {
    public abstract void process(int[] marks);
}

// Find highest scorer
class HighestScorer extends StudentAnalyzer {
    public void process(int[] marks) {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        System.out.println("Highest marks: " + highest);
    }
}

// Calculate average of top 3 marks
class TopThreeAverage extends StudentAnalyzer {
    public void process(int[] marks) {
        // Sort marks in descending order manually (simple selection sort)
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = marks[maxIndex];
            marks[maxIndex] = marks[i];
            marks[i] = temp;
        }

        int limit = n < 3 ? n : 3;
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += marks[i];
        }

        double average = (double) sum / limit;
        System.out.println("Average of top " + limit + " marks: " + average);
    }
}

// Count students failed (<40)
class FailedCount extends StudentAnalyzer {
    public void process(int[] marks) {
        int count = 0;
        for (int m : marks) {
            if (m < 40) {
                count++;
            }
        }
        System.out.println("Number of students failed (<40): " + count);
    }
}

public class StudentAnalysisApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        StudentAnalyzer[] analyzers = new StudentAnalyzer[3];
        analyzers[0] = new HighestScorer();
        analyzers[1] = new TopThreeAverage();
        analyzers[2] = new FailedCount();

        for (int i = 0; i < analyzers.length; i++) {
            analyzers[i].process(marks);
            System.out.println("-----------------------");
        }

        sc.close();
    }
}
