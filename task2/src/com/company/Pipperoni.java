package com.company;

public class Pipperoni extends Pizza{
    private boolean isSpicy;

    public Pipperoni(){}

    public Pipperoni(int weight, int price, boolean isSpicy) {
        super(weight, price);
        this.isSpicy = isSpicy;
    }

    @Override
    public void gotovit(){
        super.gotovit();
        System.out.println("Pizza (Pepperoni) № " + getPizzaNum() + " is cooking");
    }

    @Override
    public void dostavka(){
        System.out.println("Pizza (Pepperoni) № " + getPizzaNum() + " is delivered");
    }

    @Override
    public String toString(){
        return "Pepperoni : " + (isSpicy ? "spicy" : "not spicy")+ super.toString();
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
}
