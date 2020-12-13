package com.example.springboot.model;

public class Velo {

    // attributes
    private String couleur = "Jaune";

    private int grandeur = 70;

    private int embrayage = 1;

    // nested object
    private Roues roues;

    // methods
    public String printPropreties() {
        return "couleur:" + this.couleur + " grandeur:" + this.grandeur + " embrayage:" + embrayage;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getGrandeur() {
        return grandeur;
    }

    public void setGrandeur(int grandeur) {
        this.grandeur = grandeur;
    }

    public int getEmbrayage() {
        return embrayage;
    }

    public void setEmbrayage(int embrayage) {
        this.embrayage = embrayage;
    }

    public Roues getRoues() {
        return roues;
    }

    public void setRoues(Roues roues) {
        this.roues = roues;
    }
}
