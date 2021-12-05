package design.pettern.builder;

public class PetBuilder {

    public Pets prepareDog (){
        Pets pets = new Pets();
        pets.addItem(new Chihuahua());
        return pets;
    }

    public Pets prepareBird (){
        Pets pets = new Pets();
        pets.addItem(new Macaw());
        return pets;
    }
}
