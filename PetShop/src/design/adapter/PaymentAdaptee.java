package design.adapter;


public class PaymentAdaptee implements IPayment {

    CreditCardAdapter CreditCardAdapter;
    @Override
    public void Pay(String petType, float total) {
        if(petType.equalsIgnoreCase("COD") || petType.equalsIgnoreCase("CreditCard") ){
            CreditCardAdapter = new CreditCardAdapter(petType);
            CreditCardAdapter.Pay(petType,total);
        }else {
            System.out.println("Invalid payment");
        }
    }
}
