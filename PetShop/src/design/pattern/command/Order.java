package design.pattern.command;

import design.pettern.builder.Pets;

public interface Order {
    void execute(Pets pets);
}
