package enums.homepage.header;

public enum ExerciseHeaderEnum {

	BUTTON_NAMES(new String[]{"Exercises", "Quizzes", "Courses", "Certificates"}),
	
	EXERCISE_LINKS(new String[]{"HTML Exercises", "CSS Exercises", "JavaScript Exercises", "Python Exercises", "SQL Exercises"
			,"PHP Exercises", "Java Exercises", "C Exercises", "C++ Exercises", "C# Exercises", "jQuery Exercises", "React.js Exercises"
			,"MySQL Exercises", "Bootstrap 5 Exercises", "Bootstrap 4 Exercises", "Bootstrap 3 Exercises", "NumPy Exercises", "Pandas Exercises"
			,"SciPy Exercises", "TypeScript Exercises", "Excel Exercises", "R Exercises", "Git Exercises", "Kotlin Exercises", "Go Exercises"
			,"MongoDB Exercises"}),
	
	QUIZZES_LINKS(new String[]{"HTML Quiz", "CSS Quiz", "JavaScript Quiz", "Python Quiz", "SQL Quiz", "PHP Quiz", "Java Quiz", "C Quiz"
			,"C++ Quiz", "C# Quiz", "jQuery Quiz", "React.js Quiz", "MySQL Quiz", "Bootstrap 5 Quiz", "Bootstrap 4 Quiz", "Bootstrap 3 Quiz"
			,"NumPy Quiz", "Pandas Quiz", "SciPy Quiz", "TypeScript Quiz", "XML Quiz", "R Quiz", "Git Quiz", "Kotlin Quiz", "Cyber Security Quiz"
			,"Accessibility Quiz"}),
	
	COURSES_LINKS(new String[]{"HTML Course", "CSS Course", "JavaScript Course", "Front End Course", "Python Course", "SQL Course", "PHP Course"
			,"Java Course", "C++ Course", "C# Course", "jQuery Course", "React.js Course", "Bootstrap 4 Course", "Bootstrap 3 Course"
			,"NumPy Course", "Pandas Course", "TypeScript Course", "XML Course", "R Course", "Data Analytics Course", "Cyber Security Course"
			,"Accessibility Course"}),
	
	CERTIFICATES_LINKS(new String[]{"HTML Certificate", "CSS Certificate", "JavaScript Certificate", "Front End Certificate", "Python Certificate"
			,"SQL Certificate", "PHP Certificate", "Java Certificate", "C++ Certificate", "C# Certificate", "jQuery Certificate", "React.js Certificate"
			,"MySQL Certificate", "Bootstrap 5 Certificate", "Bootstrap 4 Certificate", "Bootstrap 3 Certificate", "TypeScript Certificate", "XML Certificate"
			,"Excel Certificate", "Data Science Certificate", "Cyber Security Certificate", "Accessibility Certificate"});
	
	private String[] linksArray;
	
	private ExerciseHeaderEnum(String[] linksArray){
		this.linksArray = linksArray;
	}
	
	public String[] getLinksArray(){
		return linksArray;
	}
	
	private String buttonLabel;
	
	private ExerciseHeaderEnum(String buttonLabel){
		this.buttonLabel = buttonLabel;
	}
	
	@Override
	public String toString(){
		return buttonLabel;
	}
	
}
