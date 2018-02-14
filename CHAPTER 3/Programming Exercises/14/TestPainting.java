import java.util.Scanner;

public class TestPainting {
public void main(){
    Scanner input = new Scanner(System.in);
    Painting p1 = new Painting();
    Painting p2 = new Painting();
    Painting p3 = new Painting();
    String title;
    String artist;
    String medium;//such a water color
    Double price;
    Double galleryCommission;
    //Title, artist, medium, price, galleryCommision
    //prompts the user for and accepts alues for two of the painting objects
    System.out.println("Painting 1");
    System.out.println("Input the Title: ");
    title = input.nextLine();
    System.out.println("Input the artist's name: ");
    artist = input.nextLine();
    System.out.println("Input the medium: ");
    medium = input.nextLine();
    System.out.println("Input the price: ");
    price = input.nextDouble();

    p1.setTitle(title);
    p1.setArtist(artist);
    p1.setMedium(medium);
    p1.setPrice(price);

    System.out.println("Painting 2");
    System.out.println("Input the Title: ");
    title = input.nextLine();
    System.out.println("Input the artist's name: ");
    artist = input.nextLine();
    System.out.println("Input the medium: ");
    medium = input.nextLine();
    System.out.println("Input the price: ");
    price = input.nextDouble();

    p2.setTitle(title);
    p2.setArtist(artist);
    p2.setMedium(medium);
    p2.setPrice(price);
    //Display each completed objects
    System.out.println("Painting 1");
    System.out.println("Title: "+p1.getTitle());
    System.out.println("Artist: "+p1.getArtist());
    System.out.println("Medium: "+p1.getMedium());
    System.out.println("Price: "+p1.getPrice());
    System.out.println("Price: "+p1.getCommission());

    System.out.println("Painting 2");
    System.out.println("Title: "+p2.getTitle());
    System.out.println("Artist: "+p2.getArtist());
    System.out.println("Medium: "+p2.getMedium());
    System.out.println("Price: "+p2.getPrice());
    System.out.println("Price: "+p2.getCommission());

    System.out.println("Painting 3");
    System.out.println("Title: "+p3.getTitle());
    System.out.println("Artist: "+p3.getArtist());
    System.out.println("Medium: "+p3.getMedium());
    System.out.println("Price: "+p3.getPrice());
    System.out.println("Price: "+p3.getCommission());
    //Display a message that explains the gallery commision rate
    System.out.println("The gallery commission rate is 20% of the price.");
  }
}
