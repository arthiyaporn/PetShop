package design.pattern.command;

import design.pettern.builder.Item;
import design.pettern.builder.Pets;

public class BuyPet implements Order {

    private OrderPet absOrderPet;
    public BuyPet(OrderPet absOrderPet){
        this.absOrderPet = absOrderPet;
    }

    @Override
    public void execute(Pets pets) {
        this.absOrderPet.buy();
        pets.showItems();
    }
}
