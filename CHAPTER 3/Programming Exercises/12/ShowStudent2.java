public class Student{
/*	Student class 	*/
	Integer ID;
	Double hoursEarned;
	Double pointsEarned;
	Double gradeAverage;
	public Student(){
		this.ID = 9999;
		this.hoursEarned = 12;
		this.pointsEarned = 3;
		this.gradeAverage = 4.0;
	}
	public void setID(Integer ID){
		this.ID = ID;
	}
	public void setHoursEarned(Double hoursEarned){
		this.hoursEarned = hoursEarned;
	}
	public void setPointEarned(Double pointsEarned){
		this.pointsEarned = pointsEarned;
	}
	public Integer getID(Integer ID){
		return ID;
	}
	public Integer getHoursEarned(Double hoursEarned){
		return hoursEarned;
	}
	public Double getPointEarned(Double pointsEarned){
		return pointsEarned;
	}	
	public Double gradePointAverage(){
		return pointEarned/hoursEarned;	
	}
	public void displayData(){
		System.out.println("ID: "+ ID);
		System.out.println("Hours earned: "+ hoursEarned);
		System.out.println("Points Earned: "+pointsEarned);
		System.out.println("Grade points average: "+ gradeAverage);
	}
}