
public class SpiciesOption extends ACoffeeOptions {

	public SpiciesOption(ICoffee newDecorator) {
		super(newDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return coffeeDecorator.cost() + 1;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeDecorator.getDescription() + "option: spicy\n";
	}

}
