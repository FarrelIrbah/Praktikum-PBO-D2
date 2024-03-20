public class Main {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("John Doe", 35, "123 Main St", 1001);
        Student student1 = new Student("Alice", 20, "456 Elm St", 1234);
        Student student2 = new Student("Bob", 22, "789 Oak St", 5678);

        Course mathCourse = new Course("Introduction to Mathematics", lecture);
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        lecture.teachCourse(mathCourse);
        student1.enrollCourse(mathCourse);
        student2.enrollCourse(mathCourse);

        System.out.println("Lecture Details: " + lecture.getDetails());
        System.out.println("Student 1 Details: " + student1.getDetails());
        System.out.println("Student 2 Details: " + student2.getDetails());
        System.out.println(mathCourse.viewEnrolledStudents());
        System.out.println(lecture.viewTaughtCourses());
        System.out.println(student1.viewEnrolledCourses());
    }
}
