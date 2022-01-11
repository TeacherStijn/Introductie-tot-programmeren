class Vorm {
	String kleur;
	
	Vorm() {
		System.out.println("ik ben de constructor van Vorm");
	}
}

class Rechthoek extends Vorm {
	int lengte;
	int breedte;
	
	Rechthoek() {
		System.out.println("ik ben de constructor van Rechthoek");
	}
	
	Rechthoek (String k, int l, int b) {
		this.kleur = k;	
		this.lengte = l;
		this.breedte = b;
	}
}

class Balk extends Rechthoek {
	
	int diepte;
	
	Balk () {
		System.out.println("ik ben de constructor van Balk");
	}
}

class VormenApp {
	public static void main (String args[]) {
		System.out.println("Hallo wereld!");
		
		Rechthoek mijnRechthoek;
		mijnRechthoek = new Rechthoek("Oranje", 8, 4);	

		System.out.println(mijnRechthoek.lengte);
		System.out.println(mijnRechthoek.kleur);

		System.out.println("Ik ga nu een balk maken: ");
		Balk mijnBalk = new Balk();
	}
}