import java.util.ArrayList;

public class Course {
	private String courseName;
	private String courseID;
	private Professor professor;

	private ArrayList<Feedback> feedbackList;
	private double rating;
	private double rateCount;

	Course(String courseName, String courseID, Professor professor) {
		this.setCourseName(courseName);
		this.setCourseID(courseID);
		this.setProfessor(professor);
		this.feedbackList = new ArrayList<Feedback>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Feedback> getFeedbackList() {
		return feedbackList;
	}

	public void addFeedback(Feedback feedback) {
		feedbackList.add(feedback);
	}

	public void removeFeedback(Feedback feedback) {
		feedbackList.remove(feedback);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void addRating(double rating) {
		this.rating = ((rateCount * this.rating) + rating) / (rateCount + 1);
		rateCount++;
	}
	
	public void removeRating(double rating) {
		this.rating = ((rateCount * this.rating) - rating) / (rateCount - 1);
		rateCount--;
	}

}
