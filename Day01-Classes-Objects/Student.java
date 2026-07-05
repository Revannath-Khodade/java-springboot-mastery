import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Add a grade
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Calculate average grade
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }

    public static void main(String[] args) {
        Student student = new Student("Revannath");

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        student.addGrade(88);

        student.display();
    }
}