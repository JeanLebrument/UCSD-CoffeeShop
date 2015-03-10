
public class CashPaymentFactory implements IPaymentFactory {

	@Override
	public IPaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CashPayment();
	}

}
