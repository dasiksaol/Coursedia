import java.util.ArrayList;

class Course {
    private String courseName;
    private String courseSection;
    private Faculty faculty;
    private String facultyName;

    public Course(String courseName, String courseSection, Faculty faculty) {
        this.courseName = courseName;
        this.courseSection = courseSection;
        this.faculty = faculty;
        this.facultyName = faculty.getName();
    }

    public void getCourseInfo() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Section: " + this.courseSection);
        System.out.println("Course Faculty: " + this.facultyName);
    }

    class Faculty {
        private String name;
        private String department;

        public Faculty(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }
    }

    class Feedback {
        private Course course;

        public Feedback(Course course) {
            this.course = course;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        // Create an instance of Course to access the inner class Faculty
        Course tempCourse = new Course("Temporary", "Temp 101", null);
        Course.Faculty aruna = tempCourse.new Faculty("Aruna", "IT");

        Course javaI = new Course("Introduction to Java", "ITM 101", aruna);
        courses.add(javaI);
        javaI.getCourseInfo();
    }
}
