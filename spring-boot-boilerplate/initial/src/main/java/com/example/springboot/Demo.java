package com.example.springboot;

import com.example.springboot.model.Velo;

public class Demo {
    public static void main(String[] args) {

        // Créer deux vélo différent
        // Velo objects
        Velo velo1 = new Velo();
        Velo velo2 = new Velo();

        // print velo
        System.out.println(velo1.printPropreties());
        System.out.println(velo2.printPropreties());

        System.out.println("Changement de couleur");

        velo1.setCouleur("rouge");

        velo2.setCouleur("orange");
        velo2.setGrandeur(50);

        System.out.println(velo1.printPropreties());
        System.out.println(velo2.printPropreties());
    }

}
