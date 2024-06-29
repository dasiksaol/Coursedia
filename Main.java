import java.util.Scanner;

public class Main {
	private static boolean adminAccess;
	private static Admin admin = new Admin();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("3. Exit");
			System.out.print("Choose Role: ");
			int role = sc.nextInt();
			sc.nextLine();

			if (role == 1) {
				adminMenu();
			} else if (role == 2) {
//				studentMenu();
			} else if (role == 3) {
				break;
			} else {
				System.out.println("Invalid Option. Please Try Again");
			}
		}
	}

	private static void adminLogin() {
		while (true) {
			System.out.print("Enter Username: ");
			String username = sc.nextLine();
			System.out.println();
			System.out.print("Enter Password: ");
			String password = sc.nextLine();

			if ((username.equals("admin")) && (password.equals("password"))) {
				adminAccess = true;
				break;
			} else {
				System.out.println("Invalid Username or Password");
				System.out.print("Do you wish to exit? (y/n) ");
				String choice = sc.nextLine();
				if (choice.equals("y")) {
					System.exit(0);
				}

			}
		}
	}

	private static void adminMenu() {
		adminLogin();
		while (adminAccess) {
			System.out.println("Admin Menu");
			System.out.println("1. Add Course");
			System.out.println("2. Remove Course");
			System.out.println("3. Edit Course");
			System.out.println("4. View Course List");
			System.out.println("5. Add Professor");
			System.out.println("6. Remove Professor");
			System.out.println("7. Edit Professor");
			System.out.println("8. View Professor List");
			System.out.println("9. Back to Main Menu");
			System.out.print("Choose Option: ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1: {
				System.out.println("Enter Course Name");
				String courseName = sc.nextLine();
				System.out.println("Enter course ID");
				String courseId = sc.nextLine();
				System.out.println("Enter Professor ID");
				String professorId = sc.nextLine();
				admin.addCourse(courseName, courseId, professorId);
				break;
			}
			case 2: {
				System.out.println("Enter Course ID");
				String courseId = sc.nextLine();
				admin.removeCourse(courseId);
				break;
			}
			case 3: {
				System.out.println("Enter Course ID");
				String courseId = sc.nextLine();
				System.out.println("1. Edit Name and ID");
				System.out.println("2. Edit Professor");
				System.out.println("3. Reset Rating");
				System.out.println("Choose Option: ");
				int optionEdit = sc.nextInt();
				sc.nextLine();
				switch (optionEdit) {
				case 1: {
					// ask for name and id (if dont wanna change, put "")
				}
				case 2: {
					// ask for professor id then use setProfessor
				}
				case 3: {
					// use resetCourseRating
				}
				}
			}
			case 4: {
				admin.getAllCourses();
				break;
			}
			case 5: {
				System.out.println("Enter Professor Name");
				String professorName = sc.nextLine();
				System.out.println("Enter Professor Gender");
				String professorGender = sc.nextLine();
				System.out.println("Enter Professor Id");
				String professorId = sc.nextLine();
				admin.addProfessor(professorName, professorGender, professorId);
			}
			case 6: {
				System.out.println();
			}
			case 7: {
				
			}
			case 8: {
				
			}
			case 9: {
				break;
			}
			default: {
				System.out.println("Invalid Option");
				break;
			}
			}
		}
	}

}
