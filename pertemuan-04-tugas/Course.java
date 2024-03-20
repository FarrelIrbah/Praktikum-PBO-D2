import java.util.ArrayList;
import java.util.List;

public class Course {
    protected String courseName;
    protected Person lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseName, Person lecture) {
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public String viewEnrolledStudents() {
        StringBuilder enrolledStudents = new StringBuilder("Enrolled Students: ");
        for (Student student : studentsEnrolled) {
            enrolledStudents.append(student.name).append(", ");
        }
        return enrolledStudents.toString();
    }
}
