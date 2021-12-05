package design.pattern.command;

import design.pettern.builder.Item;
import design.pettern.builder.Pets;

public class OrderPet {

    public void buy(){
            String text = String.format("Pet Bought");
            System.out.println(text);
    }

}
