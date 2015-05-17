package ProjectP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRun implements Runnable {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	
	public void run() {
		System.out.println("Welcome, dickhead");
		System.out.println("Please, tell me the number of round objects you want to stuff into your mouth doday");
		int quantity;
		String strLine;
		while(true) {
			try {
				strLine = in.readLine();
				quantity = Integer.valueOf(strLine);
				break;
			} catch (IOException e) {
				System.out.println("Ok, i see it was a hard task for you. Try again. Nuuummmbeeerr");
			}
		}
		
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
			while(true) { 
				try {
					strLine = in.readLine();
					if(strLine.equalsIgnoreCase("yes") || strLine.equalsIgnoreCase("no"))
						break;
					throw new IOException();
				} catch(IOException e) {
					System.out.println("Write yes or no you pretentious prick");
				}
			}
			if(strLine.equalsIgnoreCase("yes")) {
				System.out.println("There you go");
				BanolliGenerator.returnOrder(quantity, true);
				return;
			}
			else if(strLine.equalsIgnoreCase("no")) {
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
