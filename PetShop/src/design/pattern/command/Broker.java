package design.pattern.command;

import design.pettern.builder.Item;
import design.pettern.builder.Pets;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    private List<Pets> pets = new ArrayList<Pets>();

    public void takeOrder(Order order, Pets pp) {
        orderList.add(order);
        pets.add(pp);
    }

    public void placeOrders() {
        for (int i = 0; i < orderList.size(); i++) {
            Order orders = orderList.get(i);
            Pets pp = pets.get(i);
            orders.execute(pp);
        }
    }

    public void clearOrders() {
        orderList.clear();
    }

    public float sumOrders() {

        float total = 0;
        System.out.println(">>>>>> SUMMARY ORDER <<<<<<<<");
         for (int i = 0; i < pets.size(); i++) {
            Pets pp = pets.get(i);

            total =  total + pp.getCost();
            pp.showItems();
        }

        System.out.println("Total Price :"+total+ " baht");
        System.out.println(">>>>>> THANK YOU <<<<<<<<<<<<");

        return total;
    }
}
