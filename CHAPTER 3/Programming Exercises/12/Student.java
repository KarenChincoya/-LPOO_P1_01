public class Student{
/*	Student class 	*/
	private Integer ID;
	private Double hoursEarned;
	private Double pointsEarned;
	private Double gradeAverage;
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
