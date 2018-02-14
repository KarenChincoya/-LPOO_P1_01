public class Sandwich {
/* Sandwich class*/
	private String mainIngredient;
	private String breadType;
	private Double price;
	public void setMainIngredient(String mainIngredient){
		this.mainIngredient = mainIngredient;
	}
	public String getMainIngredient(){
		return mainIngredient;
	}
        public void setBreadType(String breadType){
		this.breadType = breadType;
	}
	public String getBreadType(){
		return breadType;
	}
        public void setMainIngredient(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return price;
        }
}
