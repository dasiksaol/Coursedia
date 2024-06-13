public class Course {
    private String courseName;
    private String courseSection;
    private Faculty faculty;
    private Course course;
    private String facultyName;

    public Course(String courseName, String courseSection, Faculty faculty) {
        this.courseName = courseName;
        this.courseSection = courseSection;
        this.faculty = faculty;
        this.facultyName = faculty.getName();
    }

    public void getCourseInfo() {
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Course Section: " + course.courseSection);
        System.out.println("Course Faculty: " + facultyName);
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


        public Feedback(Course course){
            this.course = course;
        }


    }
}
