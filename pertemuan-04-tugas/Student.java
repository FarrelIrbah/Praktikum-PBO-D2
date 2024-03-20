import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public String viewEnrolledCourses() {
        StringBuilder enrolledCourses = new StringBuilder("Enrolled Courses: ");
        for (Course course : coursesEnrolled) {
            enrolledCourses.append(course.courseName).append(", ");
        }
        return enrolledCourses.toString();
    }
}
