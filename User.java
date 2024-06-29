
public class User {

	public void addRating(Course course, int rating) {
		course.addRating(rating);
	}

	public void removeRating(Course course, int rating) {
		course.removeRating(rating);
	}
	
	public String viewRating(Course course) {
		return course.getRating() + "/5";
	}

	public void addFeedback(Course course, String studentName, String feedback) {
		Feedback fb = new Feedback(studentName, feedback);
		course.addFeedback(fb);
	}

	public void editFeedback(Course course, String studentName, String feedback) {
		for (Feedback fb : course.getFeedbackList()) {
			if (fb.getStudentName().equals(studentName)) {
				fb.setFeedback(feedback);
			}
		}
	}

	public void deleteFeedback(Course course, String studentName) {
		for (Feedback fb : course.getFeedbackList()) {
			if (fb.getStudentName().equals(studentName)) {
				course.getFeedbackList().remove(fb);
			}
		}
	}

	public void viewFeedback(Course course) {
		for (Feedback fb : course.getFeedbackList()) {
			System.out.println("Student: " + fb.getStudentName());
			System.out.println("Feedback: " + fb.getFeedback());
			System.out.println();
		}
	}
}
