class Auto {
	// attributen
	private String merk;
	private String type;
	private String kleur;
	
	// constructoren
	Auto (String m, String t, String k) {
		this.merk = m;
		this.type = t;
		this.kleur = k;
	}
	
	// methoden
	public void starten() {
		System.out.println("Hier gaat ie dan!");
	}
}

// Om deze klasse te gebruiken, dienen wij nog:
// object van de klasse te maken, ook wel 'instantiëren' van de klasse middels:

// new Auto.

// Ook dient er een main methode te zijn die de boel opstart


class Motorblok {
	private Cilinder[] cilinders;
	
	Motorblok() {
		this.cilinders = new Cilinder[4];
	}
}

class Cilinder {
	
}


class AutoDemo {
	public static void main (String args[]){ 
		Auto mijnAuto = new Auto("Nissan", "Skyline", "Paars");
		Auto mijnAuto2 = new Auto("Volvo","v40","grijs");
		mijnAuto.starten();
	}
}