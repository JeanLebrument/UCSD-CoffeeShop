
public abstract class ACoffeeOptions implements ICoffee {

	public ICoffee coffeeDecorator;
	
	public ACoffeeOptions(ICoffee newDecorator)
	{
		this.coffeeDecorator = newDecorator;
	}
	
	@Override
	abstract public float cost();

	@Override
	abstract public String getDescription();
}
