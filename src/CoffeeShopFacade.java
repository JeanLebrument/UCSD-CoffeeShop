import java.util.List;

public class CoffeeShopFacade
{	
	private CoffeeShopFacade(){}
	
	private static class CoffeeShopFacadeHolder
	{
		private static final CoffeeShopFacade _instance = new CoffeeShopFacade();
	}
	
	public static CoffeeShopFacade getInstance()
	{
		return CoffeeShopFacadeHolder._instance;
	}
	
	public void orderCoffee(String coffeeName, List<String> coffeeOptions, String paymentOption)
	{
		ICoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		IPaymentFactory paymentFactory = null;
		IPaymentMethod paymentMethod = null;
		
		if (paymentOption == "cash")
		{
			paymentFactory = new CashPaymentFactory();
			paymentMethod = paymentFactory.createPaymentMethod();
		}
		else if (paymentOption == "credit card")
		{
			paymentFactory = new CreditCardPaymentFactory();
			paymentMethod = paymentFactory.createPaymentMethod();
		}
		
		if (paymentMethod != null)
		{
			coffeeBuilder.createCoffee(coffeeName);
			coffeeBuilder.addCoffeeOptions(coffeeOptions);			
			paymentMethod.payCoffee(coffeeBuilder.getCoffee());
		}
	}
}

