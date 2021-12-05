package design.adapter;

public class COD implements Payment{
    @Override
    public void payCOD(String paymentType, float total) {
        System.out.print("Payment : " +paymentType + " Total : " + total);
    }

    @Override
    public void VerifyCard(String paymentType, String CODE) {

    }

    @Override
    public void payCreditCard(String paymentType, float total) {

    }
}
