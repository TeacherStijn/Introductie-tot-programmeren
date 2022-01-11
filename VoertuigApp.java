abstract class Voertuig {
	abstract void rijden();
}

abstract class KleinVervoer extends Voertuig {

}

class Auto extends KleinVervoer {
	void stoppen() {
		System.out.println("Nu ga ik stoppen");
	}
	
	void rijden() {
		System.out.println(this.getClass().getName() + " gaat rijden");
	}
}

class Tank extends KleinVervoer {
	void rijden() {
		System.out.println(this.getClass().getName() + " gaat rijden");
	}
}


class VoertuigApp {
	public static void main (String args[]) {
		Voertuig v = new Auto();
		v.rijden();
		v.stoppen();
	}
}