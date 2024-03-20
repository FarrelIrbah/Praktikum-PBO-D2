import java.util.ArrayList;
import java.util.List;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public String viewTaughtCourses() {
        StringBuilder taughtCourses = new StringBuilder("Taught Courses: ");
        for (Course course : coursesTaught) {
            taughtCourses.append(course.courseName).append(", ");
        }
        return taughtCourses.toString();
    }
}
