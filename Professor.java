import java.util.ArrayList;

public class Professor {

	private String professorName;
	private String professorGender;
	private ArrayList<Course> courseList = new ArrayList<Course>();

	Professor(String name, String gender) {
		this.setProfessorName(name);
		this.setProfessorGender(gender);
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getProfessorGender() {
		return professorGender;
	}

	public void setProfessorGender(String professorGender) {
		this.professorGender = professorGender;
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	
	public void addCourse(Course course) {
		this.courseList.add(course);
	}
	
	public void removeCourse(Course course) {
		this.courseList.remove(course);
	}
	
	
	
}
