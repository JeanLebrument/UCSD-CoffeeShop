import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CoffeeShop
{
	static public void main(String[] args) {	    
	    CoffeeShopFacade.getInstance().orderCoffee("strong", new ArrayList<String>(Arrays.asList("caramel", "spicies")), "cash");
	    System.out.println("\n\n");
	    CoffeeShopFacade.getInstance().orderCoffee("weak", new ArrayList<String>(Arrays.asList("caramel")), "credit card");
	    System.out.println("\n\n");
	    CoffeeShopFacade.getInstance().orderCoffee("regular", new ArrayList<String>(), "credit card");
	}
}
