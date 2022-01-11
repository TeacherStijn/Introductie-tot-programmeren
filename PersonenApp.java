class Persoon {

}

class Manager extends Persoon {
	private int aantalWerknemers;
	
	public int getAantalWerknemers() {
		return this.aantalWerknemers;
	}
	
	public void setAantalWerknemers(int invoer) {
		if (invoer <= 10) {
			this.aantalWerknemers = invoer;
		} else {
			System.out.println("Meer dan 10 werknemers mag niet");
		}
	}
}


class PersonenApp {
	public static void main (String args[]){
		Manager m = new Manager();
		m.setAantalWerknemers(18);
		System.out.println(m.getAantalWerknemers());
	}
}