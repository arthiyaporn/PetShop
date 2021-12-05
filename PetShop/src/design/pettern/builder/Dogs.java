package design.pettern.builder;

public abstract class Dogs implements Item {

    @Override
    public Packing packing() {
        return new Cage();
    }

    @Override
    public abstract float price();
}

