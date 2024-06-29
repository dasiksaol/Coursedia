import java.util.HashMap;
import java.util.Map;

public class Admin {

	private Map<String, Course> courses;
	private Map<String, Professor> professorList;

	public Admin() {
		this.courses = new HashMap<>();
		this.professorList = new HashMap<>();
	}

	public void addCourse(String courseName, String courseId, String professorId) {
		Professor professor = null;

		for (String professorNum : professorList.keySet()) {
			if (professorNum.equals(professorId)) {
				professor = professorList.get(professorId);
			}
		}

		Course course = new Course(courseName, courseId, professor);
		courses.put(courseId, course);
	}

	public void editCourse(String courseId, String courseName, String courseID) {
		Course course = null;

		for (String courseNum : courses.keySet()) {
			if (courseNum.equals(courseId)) {
				course = courses.get(courseId);
				if (courseID.matches("^[a-zA-Z]+$")) {
					courses.put(courseID, course);
					courses.remove(courseId);
					course = courses.get(courseID);
					course.setCourseID(courseID);
				}
				if (courseName.matches("^[a-zA-Z]+$")) {
					course.setCourseName(courseName);
				}

			} else {
				System.out.println("Course Not In The System");
			}
		}
	}

	public void resetCourseRating(String courseId) {
		Course course = courses.get(courseId);
		course.setRating(0);
	}

	public void removeCourse(String courseId) {
		courses.remove(courseId);
	}

	public void setProfessor(String courseId, String professorId) {
		Professor professor = null;
		for (String professorNum : professorList.keySet()) {
			if (professorNum.equals(professorId)) {
				professor = professorList.get(professorId);
			} else {
				System.out.println("Professor Not In The System");
			}
		}
		courses.get(courseId).setProfessor(professor);
	}

	public Map<String, Course> getAllCourses() {
		return courses;
	}

	public void addProfessor(String professorName, String professorGender, String professorId) {
		Professor professor = new Professor(professorName, professorGender);
		professorList.put(professorId, professor);
	}

	public void setCourse(String professorId, String courseId) {
		Course course = null;
		for (String courseNum : courses.keySet()) {
			if (courseNum.equals(courseId)) {
				course = courses.get(courseId);
				System.out.println("Successfully Added");
			} else {
				System.out.println("Course Not Foundd");
			}
		}
		professorList.get(professorId).addCourse(course);
	}

	public void removeProfessorCourse(String professorId, String courseId) {
		Professor professor = professorList.get(professorId);
		for (Course course : professor.getCourseList()) {
			if (course.getCourseID().equals(courseId)) {
				professor.removeCourse(course);
				System.out.println("Successfully Removed");
			} else {
				System.out.println("Course Not Found");
			}

		}
	}

	public void editProfessor(String professorId, String professorName, String professorGender) {

		Professor professor = null;

		for (String professorNum : professorList.keySet()) {
			if (professorNum.equals(professorId)) {
				professor = professorList.get(professorId);
				if (professorName.matches("^[a-zA-Z]+$")) {
					professor.setProfessorName(professorName);
				}
				if (professorGender.matches("^[a-zA-Z]+$")) {
					professor.setProfessorGender(professorGender);
				}
			} else {
				System.out.println("Professor Not In The System");
			}
		}

	}

	public void removeProfessor(String professorId) {
		professorList.remove(professorId);
	}

	public Map<String, Professor> getAllProfessor() {
		return professorList;

	}
}
