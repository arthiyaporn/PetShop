package design.pettern.builder;

public class Macaw extends Birds{
    @Override
    public String name() {
        return "Macaw";
    }

    @Override
    public float price() {
        return 2500;
    }
}