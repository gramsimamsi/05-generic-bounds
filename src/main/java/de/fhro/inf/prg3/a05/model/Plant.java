package de.fhro.inf.prg3.a05.model;

public abstract class Plant {

    private double height;
    private String family;
    private String name;

    Plant(double height, String family, String name){
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();
}
