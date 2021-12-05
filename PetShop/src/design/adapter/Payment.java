package design.adapter;

public interface Payment {
    public void payCOD(String paymentType, float total);
    public void VerifyCard(String paymentType, String CODE);
    public void payCreditCard(String paymentType, float total);
}
