package ProjectP;


import java.util.Random;

// Poject P - Jesus

public class BanolliGenerator {
	static Random rand = new Random();
	
	public static Pizza returnPizza() {
			
		Pizza[] pizzas = Pizza.values();
		int index = rand.nextInt(pizzas.length);
		return pizzas[index];
	
	}
	

	public static void main(String[] args) {
		Pizza p1 = returnPizza();
		Pizza p2 = null;
		do {
			p2 = returnPizza();
		} while(p1==p2);
		Pizza[] pizzas = { p1, p2 };
		System.out.println("Todays menu: " + pizzas[0] + " and " + pizzas[1]);

	}
	
}
