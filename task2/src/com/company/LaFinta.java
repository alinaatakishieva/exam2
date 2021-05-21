package com.company;

public class LaFinta extends Pizza {
    private boolean withMushrooms;

    public LaFinta(){}

    public LaFinta(int weight, int price, boolean withMushrooms) {
        super(weight, price);
        this.withMushrooms = withMushrooms;
    }

    @Override
    public void gotovit(){
        super.gotovit();
        System.out.println("Pizza (La Finta) № " + getPizzaNum() + " is cooking");
    }

    @Override
    public void dostavka(){
        System.out.println("Pizza (La Finta) № " + getPizzaNum() + " is delivered");
    }

    @Override
    public String toString(){
        return "Margarita : " + (withMushrooms ? "with mushrooms" : "without mushrooms")+ super.toString();
    }


    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        this.withMushrooms = withMushrooms;
    }
}
