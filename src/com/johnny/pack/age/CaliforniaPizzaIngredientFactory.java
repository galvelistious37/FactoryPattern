package com.johnny.pack.age;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new StuffedCrust();
    }

    @Override
    public Sauce createSauce() {
        return new JalapenoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new PepperJack();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Jalapeno(), new Mushroom(), new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
