
public class CreditCardPaymentFactory implements IPaymentFactory {

	@Override
	public IPaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CreditCardPayment();
	}
}
