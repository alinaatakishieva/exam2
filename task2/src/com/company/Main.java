package com.company;

public class Main {

    public static void main(String[] args) {
        Pipperoni pipperoni = new Pipperoni(500,300,false);
        pipperoni.gotovit();
        pipperoni.dostavka();
        System.out.println(pipperoni);

        separate();

        Margarita margarita = new Margarita(400, 200, true);
        margarita.gotovit();
        margarita.dostavka();
        System.out.println(margarita);

        separate();

        LaFinta laFinta = new LaFinta(300, 600, true);
        laFinta.gotovit();
        laFinta.dostavka();
        System.out.println(laFinta);

    }
    public static void separate(){
        System.out.println("''''''''''''''''''''''");
    }
}
