import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

package MovieRental;

public class Main {
  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

    String result = new RentalInfo().statement(new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1))));

    if (!result.equals(expected)) {
      logger.log(Level.SEVERE, "Expected: {0}{1}{1}Got: {2}", new Object[] { expected, System.lineSeparator(), result });
      throw new AssertionError("Test failed. See logs for details.");
    }

    logger.log(Level.INFO, "Success");
  }
}
