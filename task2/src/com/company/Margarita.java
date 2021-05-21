package com.company;

public class Margarita extends Pizza {
    private boolean withMeat;

    public Margarita() {
    }


    public Margarita(int weight, int price, boolean withMeat) {
        super(weight, price);
        this.withMeat = withMeat;
    }

    @Override
    public void gotovit(){
        super.gotovit();
        System.out.println("Pizza (Margarita) № " + getPizzaNum() + " is cooking");
    }

    @Override
    public void dostavka(){
        System.out.println("Pizza (Margarita) № " + getPizzaNum() + " is delivered");
    }

    @Override
    public String toString(){
        return "Margarita : " + (withMeat ? "with meat" : "without meat")+ super.toString();
    }



    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        withMeat = withMeat;
    }
}
