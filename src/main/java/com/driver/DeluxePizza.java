package com.driver;

class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // Deluxe Pizza comes with extra cheese and toppings by default
        addExtraCheese();
        addExtraToppings();
    }
}
