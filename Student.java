import java.util.*;
class Student {
	String index;
	String firstName;
	String lastName;
	List<int> grades;
	//TODO constructor
	Student(String index, String firstname, String lastName){
		this.index=index;
		this.firstName=firstname;
		this.lastName=lastName;
	}
	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<int> getGrades() {
		return grades;
	}

	public void setGrades(List<int> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		int sum=0;
		for (int grade :
				grades) {
			sum+=grade;
		}
		return grades/(grades.size()*1.0);
	}

	public int ECTSCredits() {
		return grades.size()*6;
	}
}
