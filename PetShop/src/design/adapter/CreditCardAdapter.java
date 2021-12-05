package design.adapter;


public class CreditCardAdapter implements  IPayment{

    Payment pay;
    public CreditCardAdapter(String payment){
        if(payment.equalsIgnoreCase("COD") ){
            pay = new COD();
        }else {
            pay = new CrediteCard();
        }
    }

    @Override
    public void Pay(String payment, float total) {
        if(payment.equalsIgnoreCase("COD") ){
            pay.payCOD(payment,total);
        }else {
            pay.VerifyCard(payment,"1234");
            pay.payCreditCard(payment,total);
        }
    }
}
