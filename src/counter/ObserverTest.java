package counter;

import java.util.Scanner;

/**
 * Test the Observer Observable behavior for Counter object.
 * @author Vichaphol Thamsuthikul
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		final Scanner console = new Scanner(System.in);
		Counter counter = new Counter();
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		CounterView view2 = new CounterView(counter);
		view2.run();
		while(true) {
			System.out.print("Count how much? ");
			int howMuch = console.nextInt();
			counter.add(howMuch);
		}
	}
}
