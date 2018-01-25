package de.fhro.inf.prg3.a05.model;

public class Flower extends Plant {

    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) throws IllegalArgumentException {
        super(height, family, name);
        if(color == PlantColor.GREEN){
            IllegalArgumentException e = new IllegalArgumentException();
            System.err.println("There are no green Flowers!");
            e.printStackTrace();
            throw e;
        }
        else{
            this.color = color;
        }
    }

    @Override
    public PlantColor getColor() { return color; }
}
