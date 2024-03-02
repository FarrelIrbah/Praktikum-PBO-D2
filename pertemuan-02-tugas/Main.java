public class Main {
  public static void main(String[] args) {
      // Create Lecturers
      Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);

      // Create Students
      Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
      Student dani = new Student("Dani", 20, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);

      // Create Courses
      Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
      Course cs102 = new Course("CS102", "Data Structures", agus);
      Course cs103 = new Course("CS103", "Algorithms", bambang);

      // Assign Courses to Lecturers
      agus.teachCourse(cs101);
      agus.teachCourse(cs102);
      bambang.teachCourse(cs103);

      // Enroll Students to Courses
      cs101.addStudent(cahyo);
      cs101.addStudent(dani);
      cs101.addStudent(edi);

      cs102.addStudent(cahyo);
      cs102.addStudent(dani);

      cs103.addStudent(cahyo);

      // Enroll Cahyo to Additional Courses
      cs103.addStudent(cahyo);
      cs102.addStudent(cahyo);

      // Print Results
      System.out.println("Courses enrolled by Cahyo:");
      cahyo.viewEnrolledCourses();
      System.out.println();

      System.out.println("Courses taught by Agus:");
      agus.viewTaughtCourses();
      System.out.println();

      System.out.println("Students enrolled in Intro to Computer Science:");
      cs101.viewEnrolledStudents();
  }
}
