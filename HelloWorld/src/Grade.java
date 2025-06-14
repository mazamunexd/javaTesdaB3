public class Grade {
    char grade;

    public void calculateGrade() {
        int score = Integer.parseInt(System.console().readLine("Enter the student's score: "));

        if (score >= 90) {
            grade = 'A';
            System.out.println("The student's grade is: " + grade);
        } else if (score >= 80) {
            grade = 'B';
            System.out.println("The student's grade is: " + grade);
        } else if (score >= 70) {
            grade = 'C';
            System.out.println("The student's grade is: " + grade);
        } else if (score >= 60) {
            grade = 'D';
            System.out.println("The student's grade is: " + grade);
        } else {
            grade = 'F';
            System.out.println("The student's grade is: " + grade + " Find new school brother.");
        }
    }
    public static void main(String[] args) {
        Grade gradeCalculator = new Grade();
        gradeCalculator.calculateGrade();
    }
} 
