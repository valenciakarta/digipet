public abstract class Pet {

	private String name;
	private String type;
	private int happiness;
	private int health;
	private int cleanness;
	
	public Pet(String name, String type) {
		super();
		this.name = name;
		this.type = type;
		this.happiness = 10;
		this.health = 10;
		this.cleanness = 10;
	}

	public void petName() {
		System.out.printf("|Name     : %-9s|\n", name);
		System.out.printf("|Type     : %-9s|\n", type);
	}
	
	public void petStatus() {
		System.out.printf("|Happiness: %-9d|\n", happiness);
		System.out.printf("|Health   : %-9d|\n", health);
		System.out.printf("|Cleanness: %-9d|\n", cleanness);
	}

	public abstract void bathing();
	
	public abstract void playing();
	
	public abstract void eating();
	
	public void bored() {
		System.out.println("bored");
	}
	
	public void hungry() {
		System.out.println("hungry");
	}
	
	public void dirty() {
		System.out.println("dirty");
	}
	
	private void play() {
		happiness += 3;
		health -= 1;
		cleanness -= 1;
	}
	
	private void eat() {
		happiness -= 1;
		health += 3;
		cleanness -= 1;
	}
	
	private void bath() {
		happiness -= 1;
		health -= 1;
		cleanness += 3;
	}
	
	private void needPlay() {
		if(happiness - 1 <= 1) {
			bored();
			System.out.println(name + " needs to play!");
		}
	}
	
	private void needEat() {
		if(health - 1 <= 1) {
			hungry();
			System.out.println(name + " needs to eat!");
		}
	}

	private void needBath() {
		if(cleanness - 1 <= 1) {
			dirty();
			System.out.println(name + " needs to bath!");
		}
	}
	
	public void validatePlay() {
		if(health - 1 > 0 || cleanness - 1 > 0) {
			if(health <= 0) {
				needEat();
			}else if(cleanness <= 0) {
				needBath();
			}else {
				play();
				playing();
			}
		}else{
			needEat();
			needBath();
		}
	}
	
	public void validateEat() {
		if(happiness - 1 > 0 || cleanness - 1 > 0) {
			if(cleanness <= 0) {
				needBath();
			}else if(happiness <= 0) {
				needPlay();
			}else {
				eat();
				eating();
			}
		}else{
			needPlay();
			needBath();
		}
	}
	
	public void validateBath() {
		if(health - 1 > 0 || happiness - 1 > 0) {
			if(health <= 0) {
				needEat();
			}else if(happiness <= 0) {
				needPlay();
			}else {
				bath();
				bathing();
			}
		}else{
			needEat();
			needPlay();
		}
	}
}
