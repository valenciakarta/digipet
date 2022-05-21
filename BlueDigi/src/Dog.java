
public class Dog extends Pet{

	private String breed;

	public Dog(String name, String type, String breed) {
		super(name, type);
		this.breed = breed;
	}

	public void petStatus() {
		super.petName();
		System.out.printf("|Breed    : %-9s|\n", breed);
		super.petStatus();
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("Barking... tails wagging");
	}

	@Override
	public void bathing() {
		// TODO Auto-generated method stub
		System.out.println("Barking... running away");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Chomp chomp... chewing");
	}

	@Override
	public void bored() {
		// TODO Auto-generated method stub
		System.out.println("Hfff... laying down");
	}

	@Override
	public void hungry() {
		// TODO Auto-generated method stub
		System.out.println("Woof...woof...");
	}

	@Override
	public void dirty() {
		System.out.println("Roll around");
	}

	
	
	
}
