public class Painting {
  private String title;
  private String artist;
  private String medium;//such a water color
  private Double price;
  private Double galleryCommission;
  public Painting(){ //Title, artist, medium, price, galleryCommision
    this.title = "Title";
    this.artist = "Artist";
    this.medium = "Medium";
    this.price = 0.0;
    this.galleryCommission = 0.0;
    //title
  }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
      return title;
    }
    //artist
    public void setArtist(String artist){
      this.artist = artist;
    }
    public String getArtist(){
      return artist;
    }
    //medium
    public void setMedium(String medium){
      this.medium = medium;
    }
    public String getMedium(){
      return medium;
    }
    //price
    public void setPrice(Double price){
      this.price = price;
    }
    public Double getPrice(){
      return price;
    }
    private void setCommission(){
      galleryCommission = price*0.20;
    }

    public Double getCommission(){
      return galleryCommission;
    }
 }
