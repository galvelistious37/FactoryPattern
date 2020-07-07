package com.johnny.pack.age;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore caliStore = new CaliforniaStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ordered " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ordered " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("clam");
        System.out.println("Ordered " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = caliStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = caliStore.orderPizza("pepperoni");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = caliStore.orderPizza("veggie");
        System.out.println("Ordered a " + pizza.getName() + "\n");
        pizza = caliStore.orderPizza("clam");
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}
