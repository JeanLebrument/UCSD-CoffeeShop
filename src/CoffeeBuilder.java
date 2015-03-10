import java.util.List;

public class CoffeeBuilder implements ICoffeeBuilder
{	
	private ICoffee coffee;
	
	@Override
	public void createCoffee(String coffeeName)
	{
		if (coffeeName == "weak")
		{
			this.coffee = new WeakCoffee();
			System.out.println(coffeeName + " coffee created");
		}
		else if (coffeeName == "regular")
		{
			this.coffee = new RegularCoffee();
			System.out.println(coffeeName + " coffee created");
		}
		else if (coffeeName == "strong")
		{
			this.coffee = new StrongCoffee();
			System.out.println(coffeeName + " coffee created");
		}
		else
		{
			System.out.println(coffeeName + " coffee doesn't exist.");
		}
		// TODO Auto-generated method stub	
	}

	@Override
	public void addCoffeeOptions(List<String> coffeeOptions)
	{
		if (this.coffee != null)
		{
			for (String coffeeOption : coffeeOptions)
			{
				if (coffeeOption == "caramel")
				{
					this.coffee = new CaramelOption(this.coffee);
					System.out.println(coffeeOption + " option added to coffee");
				}
				else if (coffeeOption == "spicies")
				{
					this.coffee = new SpiciesOption(this.coffee);
					System.out.println(coffeeOption + " option added to coffee");
				}
				else
				{
					System.out.println(coffeeOption + " option doesn't exist.");
					return;
				}
			}
		}
		else
		{
			System.out.println("Coffee should be created to add options in it.");
		}
	}

	@Override
	public ICoffee getCoffee()
	{
		return coffee;
	}

}
