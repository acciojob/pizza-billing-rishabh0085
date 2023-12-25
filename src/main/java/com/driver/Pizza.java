package com.driver;

public class Pizza {

    private int basePrice;
    private Boolean isVeg;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 0;
        this.extraToppingsPrice = 0;
        this.paperBagPrice = 0;
        this.bill = "";
    }

    public int getPrice(){
        return this.basePrice + this.extraCheesePrice + this.extraToppingsPrice + this.paperBagPrice;
    }

    public void addExtraCheese(){
        if (extraCheesePrice == 0) {
            extraCheesePrice = 80;
            this.bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
    }

    public void addExtraToppings(){
        if (extraToppingsPrice == 0) {
            extraToppingsPrice = isVeg ? 70 : 120;
            this.bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        if (paperBagPrice == 0) {
            paperBagPrice = 20;
            this.bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: " + basePrice + "\n" + this.bill;
        this.bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
