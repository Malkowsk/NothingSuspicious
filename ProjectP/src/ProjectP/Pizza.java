package ProjectP;

enum Pizza {
	
	ALTONO(false, false), 
	CHLOPSKA(false, true),
	GUSTO(false, false),
	ROBERTO(true, false),
	PECORINO(true, false),
	VERA(false, false), 
	AMORE(false, false), 
	PARMA(false, false), 
	KEBAB_PIZZA(false, true),
	MATADOR(false, false), 
	BANOLLI(false, false);
	
	boolean cucumber;
	boolean sourCabbage;
	Pizza(boolean c, boolean sc) {
		cucumber = c;
		sourCabbage = sc;
	}
	@Override
	public String toString() {
		String unwantedCrap = null;
		if(cucumber)
			unwantedCrap = "cucumber";
		if(sourCabbage)
			unwantedCrap = "sour cabbage";
		if(unwantedCrap == null)
			return super.toString();
		else
			return super.toString() + "(with " + unwantedCrap + ")";
	}
}