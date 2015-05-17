package ProjectP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRun implements Runnable {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	
	public void run() {
		System.out.println("Welcome, dickhead");
		System.out.println("Please, tell me the number of round objects you want to stuff into your mouth doday");
		int quantity = AuxilliaryMethodHolder.getPizzasQuantity(in);
		String strLine;
		
		if(quantity == 0) {
			System.out.println("Then why even bother, dickhead");
			return;
		}
		if(quantity == 1) {
			System.out.println("Ok then.");
			BanolliGenerator.returnOrder(quantity, false);
			return;
		}
		if(quantity > 1) {
			System.out.println("Would you accept duplicates?");
			boolean decision = AuxilliaryMethodHolder.getAnswerDuplicates(in);
			if(decision) {
				System.out.println("There you go");
				BanolliGenerator.returnOrder(quantity, true);
				return;
			}
			else {
				System.out.println("Ok");
				BanolliGenerator.returnOrder(quantity, false);
				return;
			}
		}

	}

	
	public static void main(String[] args) {
		ConsoleRun d = new ConsoleRun();
		d.run();
	}
	
	
	
}
