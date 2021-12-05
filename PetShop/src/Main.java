import design.adapter.PaymentAdaptee;
import design.pattern.command.Broker;
import design.pattern.command.BuyPet;
import design.pattern.command.OrderPet;
import design.pettern.builder.*;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int types = 0;

        System.out.println("Welcome to the PetShop!\n");
        System.out.println("-----------------------------------------------------------");
        Scanner userInput = new Scanner(System.in);


        //******************* COMMAND PATTERN ******************//
        OrderPet abcOrderPet = new OrderPet();

        Broker broker = new Broker();


        PetBuilder mealBuilder = new PetBuilder();
        BuyPet buyPetOrder = new BuyPet(abcOrderPet);

        while (types != 3){
            System.out.println("Choose order types of pet to Buy \n" +
                    "1.Dog\n" +
                    "2.Bird\n" +
                    "3.Confirm Order");
            types = userInput.nextInt();  // Read user input
            System.out.println("Enter: " + types);  // Output user input
            Pets vegMeal = null;
            if (types == 1) {
                vegMeal = mealBuilder.prepareDog();
                broker.takeOrder(buyPetOrder, vegMeal);
            } else if (types == 2) {
                vegMeal = mealBuilder.prepareBird();
                broker.takeOrder(buyPetOrder, vegMeal);
            }

            broker.placeOrders();
        }

        if(types == 3){
            float total= broker.sumOrders();
            System.out.println("Choose order types of payment \n" +
                    "1.COD\n" +
                    "2.Credit Card");
            types = userInput.nextInt();  // Read user input
            System.out.println("Enter: " + types);  // Output user input

            String paymentType = "";
            if( types == 1) {
                paymentType = "COD";
            }else if(types == 2){
                paymentType = "CreditCard";
            }
            PaymentAdaptee cc = new PaymentAdaptee();
            cc.Pay(paymentType,total);
            broker.clearOrders();
        }
    } 
}


