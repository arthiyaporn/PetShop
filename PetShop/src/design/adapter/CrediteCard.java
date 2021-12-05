package design.adapter;

public class CrediteCard implements Payment{
    @Override
    public void payCOD(String paymentType, float total) {

    }

    @Override
    public void VerifyCard(String paymentType, String CODE) {
        System.out.print("Payment : " +paymentType + " CODE : " + CODE);
    }

    @Override
    public void payCreditCard(String paymentType, float total) {
        System.out.print("Payment : " +paymentType + " Total : " + total);
    }
}
