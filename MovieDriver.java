import java.util.*;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Movie myObj = new Movie();
		
		System.out.print("Enter the title of a movie: ");
		myObj.setTitle(keyboard.nextLine());
		
		System.out.print("Enter the movie's rating: ");
		myObj.setRating(keyboard.nextLine());
		
		System.out.print("Enter the number of tickets sold at the theater: ");
		myObj.setSoldTickets(keyboard.nextInt());
		
		System.out.println(myObj.toString());
	}

}
