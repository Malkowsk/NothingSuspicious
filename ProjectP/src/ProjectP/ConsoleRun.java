package ProjectP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRun implements Runnable {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	
	public void run() {
		System.out.println("Welcome, dickhead");
		System.out.println("Please, tell me the number of round objects you want to stuff into your mouth doday");
		while(true) {
			try {
				String strLine = in.readLine();
				int quantity = Integer.valueOf(strLine);
				if(quantity == 0) {
					System.out.println("Then why even bother, dickhead");
					System.exit(0);
				}
				if(quantity == 1) {
					System.out.println("Ok then.");
					BanolliGenerator.returnOrder(quantity, false);
					System.exit(0);
				}
				if(quantity > 1) {
					System.out.println("Would you accept duplicates?");
					strLine = in.readLine();
					if(strLine.equalsIgnoreCase("yes")) {
						System.out.println("There you go");
						BanolliGenerator.returnOrder(quantity, true);
						System.exit(0);
					}
					else if(strLine.equalsIgnoreCase("no")) {
						System.out.println("Ok");
						BanolliGenerator.returnOrder(quantity, false);
						System.exit(0);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		ConsoleRun d = new ConsoleRun();
		d.run();
	}
	
	
	
}
