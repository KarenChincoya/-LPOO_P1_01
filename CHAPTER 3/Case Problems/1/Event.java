class Event{
	public final static Integer generalPrice = 35;
	public final static Integer largeEventCutoff = 50;
	private String event;
	private Integer guests;
	private Integer price;
	public void setEventNumber(String event){
		this.event = event;
	}
	public void setGuests(Integer guests){
		this.guests = guests;
		this.price = guests*generalPrice;
	}
	//Three get methods
	public String getEvent(){
		return event;
	}
	public Integer getGuests(){
		return guests;
	}
	public Integer getPrice(){
		return price;
	}
}