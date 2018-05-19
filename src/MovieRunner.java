import javax.swing.JOptionPane;

public class MovieRunner {
public static void main(String[] args) {
	Movie infinitywar= new Movie("Avengers: Infinity War", 5);
	Movie thor2 = new Movie("Thor: The Dark World", 1);
	Movie blackpanther = new Movie("Black Panther", 4);
	Movie doctorstrange= new Movie("Doctor Strange", 3);
	Movie howard = new Movie("Howard the Duck", 0);
	infinitywar.getTicketPrice();
	JOptionPane.showMessageDialog(null, infinitywar.getTicketPrice());
	NetflixQueue netflix = new NetflixQueue();
	netflix.addMovie(infinitywar);
	netflix.addMovie(thor2);
	netflix.addMovie(doctorstrange);
	netflix.addMovie(blackpanther);
	netflix.addMovie(howard);
	netflix.printMovies();
	netflix.getBestMovie();
}
}
