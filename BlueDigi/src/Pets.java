
public class Pets {

	private Hedgehog hedgehog;
	private Dog dog;
	public Hedgehog getHedgehog() {
		return hedgehog;
	}
	public void setHedgehog(Hedgehog hedgehog) {
		this.hedgehog = hedgehog;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Pets() {
		super();
		this.hedgehog = new Hedgehog("Dochie", "Hedgehog", "Brown");
		this.dog = new Dog("Soju", "Dog", "Corgi");
	}
	
	
}
