package com.example.sodaapp;

import java.util.ArrayList;

public class SodaExpert {
    public ArrayList<String> findMySoda(String itemChosen){
        ArrayList<String> soda = new ArrayList<>();
        switch(itemChosen){
            case "Dark":
                soda.add("CocaCola");
                soda.add("Pepsi");
                break;
            case "Brown":
                soda.add("Pommes");
                soda.add("RedBull");
                break;
            case "Light" :
                soda.add("Pepsi");
                soda.add("Walmass");
                break;
            case "Yellow":
                soda.add("Fanta");
                soda.add("Haway");
                break;
        }
        return soda;
    }
}
