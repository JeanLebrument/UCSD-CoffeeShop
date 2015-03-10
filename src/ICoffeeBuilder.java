import java.util.List;

public interface ICoffeeBuilder
{
	public void createCoffee(String coffeeName);
	public void addCoffeeOptions(List<String> coffeeOptions);
	public ICoffee getCoffee(); 
}
