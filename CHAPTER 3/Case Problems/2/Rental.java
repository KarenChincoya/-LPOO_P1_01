public class Rental{
  public final static Integer minutesInAnHour = 60;
  public final static Integer hourlyRentalRate = 40;
  private String contractNumber;
  private Integer hours;
  private Integer minutes;
  private Double price;
  public void setContractNumber(String contractNumber){
    this.contractNumber = contractNumber;
  }
  public void setHoursAndMinutes(Integer minutes){
    this.hours = (minutes - (minutes%60))/60;
    this.minutes = minutes%60;
    this.price = this.hours * hourlyRentalRate + this.minutes;
  }
  public String getContractNumber(){
    return this.contractNumber;
  }
  public Integer getHours(){
    return this.hours;
  }
  public Integer getMinutes(){
    return this.minutes;
  }
  public Double getPrice(){
    return this.price;
  }
}
