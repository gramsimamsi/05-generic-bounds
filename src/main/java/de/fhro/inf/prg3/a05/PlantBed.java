package de.fhro.inf.prg3.a05;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;

public class PlantBed<T extends Plant> {

    private SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<>();
    }

    public void add(T plant){
        plants.add(plant);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        return plants.filter(item -> item.getColor() == color);
    }

    public SimpleList<T> getPlants() { return plants; }
}
