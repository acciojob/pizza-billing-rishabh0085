package com.driver;

public class Pizza {
 
    private int price;
    private Boolean isVeg = true;
    private String bill  = "";
 
    public Boolean isCheese = false;
 
    public Boolean isTopping = false;
 
    public Boolean isBag = false;
 
    public Boolean isBill = false;
 
 
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price = 300;
            this.bill = this.bill + "Base Price Of The Pizza: 300" + "\n";
        }
        else
        {
            this.price = 400;
            bill = bill + "Base Price Of The Pizza: 400" + "\n";
        }
    }
 
    public int getPrice(){
        return this.price;
    }
 
    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheese) {
            this.price = this.price + 80;
            bill = bill + "Extra Cheese Added: 80" + "\n";
            this.isCheese =true;
 
        }
 
    }
 
    public void addExtraToppings(){
        // your code goes here
        if(!this.isTopping) {
            if (isVeg) {
                this.price = this.price + 70;
                bill = bill + "Extra Toppings Added: 70" + "\n";
            } else {
                this.price = this.price + 120;
                bill = bill + "Extra Toppings Added: 120" + "\n";
            }
            isTopping = true;
        }
    }
 
    public void addTakeaway(){
        // your code goes here
        if(!this.isBag) {
            this.price = this.price + 20;
            bill = bill + "Paperbag Added: 20" + "\n";
            isBag = true;
        }
    }
 
    public String getBill(){
        // your code goes here
        if(!isBill) {
            bill = bill + "Total Price: " + this.price + "\n";
            this.isBill = true;
            return this.bill;
 
        }
        else {
            return this.bill;
        }
    }
}
