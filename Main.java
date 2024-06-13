import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        Faculty aruna = new Faculty("Aruna", "IT");
        Course javaI = new Course("Introduction to Java", "ITM 101", aruna);
        courses.add(javaI);
        javaI.getCourseInfo();
    }


}