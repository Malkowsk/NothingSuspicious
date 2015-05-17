package ProjectP;

import java.io.BufferedReader;
import java.io.IOException;

public class AuxilliaryMethodHolder {
	
	public static int getPizzasQuantity(BufferedReader in) {
		String strLine;
		int quantity;		
		while(true) {
			try {
				strLine = in.readLine();
				quantity = Integer.valueOf(strLine);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ok, i see it was a hard task for you. Try again. Nuuummmbeeerr");
			} catch (IOException e) {
				System.out.println("Ok, i see it was a hard task for you. Try again. Nuuummmbeeerr");
			}
		}
		return quantity;
	}
	
	public static boolean getAnswerDuplicates(BufferedReader in) {
		String strLine;
		boolean answer;
		while(true) { 
			try {
				strLine = in.readLine();
				if(strLine.equalsIgnoreCase("yes")) {
					answer = true;
					break;
				}
				if(strLine.equalsIgnoreCase("no")) {
					answer = false;
					break;
				}
				throw new IOException();
			} catch(IOException e) {
				System.out.println("Write yes or no you pretentious prick");
			}
		}
		return answer;
	}
}
