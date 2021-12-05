package design.pettern.builder;

public abstract class Birds implements Item {
    @Override
    public Packing packing() {
        return new GlassCabinet();
    }

    @Override
    public abstract float price();
}
