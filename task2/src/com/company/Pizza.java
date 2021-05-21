package com.company;

public class Pizza {
    private static int pizzaNum;

    private int weight;
    private int price;

    public void gotovit(){
        pizzaNum ++;
    }


    public void dostavka(){
        System.out.println("Pizza № " + pizzaNum + "is delivering)");
    }

    public static int getPizzaNum() {
        return pizzaNum;
    }

    public static void setPizzaNum(int pizzaNum) {
        Pizza.pizzaNum = pizzaNum;
    }

    public Pizza(){}

    public Pizza(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return " weight: " + weight + " price: " + price;
    }
}
