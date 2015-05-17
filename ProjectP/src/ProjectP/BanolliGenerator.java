package ProjectP;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Poject P - Jesus

public class BanolliGenerator {
	static Random rand = new Random();
	
	public static Pizza returnPizza() {
			
		Pizza[] pizzas = Pizza.values();
		int index = rand.nextInt(pizzas.length);
		return pizzas[index];
	
	}
	
	public static ArrayList<Pizza> withDuplicates(int quantity) {
		ArrayList<Pizza> pizzas = new ArrayList<>(quantity);			
		for(int i = 0; i<quantity; i++) 
			pizzas.add(returnPizza());
		return pizzas;
	}
	
	public static Set<Pizza> withoutDuplicates(int quantity) {
		Set<Pizza> pizzas = new HashSet<>(quantity);
		while(pizzas.size()<quantity) {
			pizzas.add(returnPizza());
		}
		return pizzas;
	}
	

	public static void getPizzaList(int quantity, boolean allowDuplicates) {
		
		Collection<Pizza> pizzas;
		
		if(allowDuplicates) 
			pizzas = withDuplicates(quantity);
		else
			pizzas = withoutDuplicates(quantity);
		
		System.out.println("Todays menu :");
		
		for(Pizza p : pizzas) {
			System.out.println(p);
		}
			
	}
	
	public static void main(String[] args) {
		getPizzaList(5, true);
		System.out.println();
		getPizzaList(7, false);
	}
		
		//Pizza p1 = returnPizza();
		//Pizza p2 = null;
		//do {
			//p2 = returnPizza();
		//} while(p1==p2);
		//Pizza[] pizzas = { p1, p2 };
		//System.out.println("Todays menu: " + pizzas[0] + " and " + pizzas[1]);

}
	