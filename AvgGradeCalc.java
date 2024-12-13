import java.util.Scanner;

public class AvgGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t\t\t STUDENT GRADE CALCULATOR \t\t\n");
        System.out.print("Enter the number of grades: ");
        int n = sc.nextInt();
        
        // Initialize array to store grades
        char[] grades = new char[n];
        
        System.out.println("Grades: S,A,B,C,D,E,F");
        System.out.println("Grade Points: 10,9,8,7,6,5  \n");
        
        // Input grades
        for(int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.next().toUpperCase().charAt(0);
        }
        System.out.println();
        
        // Calculate sum of grade points
        int sum = 0;
        for(char grade : grades) {
            int num = ConvertGradeToNum(grade);
            sum += num;
        }
        
        // Calculate average grade point
        double avg = (double) sum / n;
        int roundedAvg = (int) Math.round(avg);
        String avgGrade = ConvertGrade(roundedAvg);
        
        // Output results
        System.out.println("Average Grade Point: " + avg);
        System.out.println("Average Grade: " + avgGrade);
        
        sc.close();
    }
    
    // Convert grade character to grade point
    public static int ConvertGradeToNum(char grade) {
        switch(grade) {
            case 'S':
                return 10;
            case 'A':
                return 9;
            case 'B':
                return 8;
            case 'C':
                return 7;
            case 'D':
                return 6;
            case 'E':
                return 5;
            default:
                return 0; 
        }
    }
    
    // Convert grade point to grade character
    public static String ConvertGrade(int roundedAvg) {
        switch(roundedAvg) {
            case 10:
                return "S";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "F"; // Handle invalid grades as needed
        }
    }
}

