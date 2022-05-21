
public class Hedgehog extends Pet{

	private String color;

	public Hedgehog(String name, String type, String color) {
		super(name, type);
		this.color = color;
	}

	public void petStatus() {
		super.petName();
		System.out.printf("|Color    : %-9s|\n", color);
		super.petStatus();
	}

	@Override
	public void bathing() {
		// TODO Auto-generated method stub
		System.out.println("Hissing... quills rising");
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("Squeaking... excited");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Crunch crunch... chewing");
	}

	@Override
	public void bored() {
		// TODO Auto-generated method stub
		System.out.println("Hmpphh...");
	}

	@Override
	public void hungry() {
		// TODO Auto-generated method stub
		System.out.println("Grfff...");
	}

	@Override
	public void dirty() {
		// TODO Auto-generated method stub
		System.out.println("Achooo...");
	}

	
}
