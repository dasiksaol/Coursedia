
public class Feedback {
	private String studentName;
	private String feedback;
	
	public Feedback(String studentName, String feedback) {
		this.setStudentName(studentName);
		this.setFeedback(feedback);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
