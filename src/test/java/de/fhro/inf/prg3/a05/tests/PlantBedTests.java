package de.fhro.inf.prg3.a05.tests;

import de.fhro.inf.prg3.a05.PlantBed;
import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;
import de.fhro.inf.prg3.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTests {

    private final Logger logger = LogManager.getLogger();
    private PlantBed<Plant> plantBed;
    private Flower phillippBlume;
    private Shrub peterBusch;

    @BeforeEach
    void setup(){
        plantBed = new PlantBed<>();
        phillippBlume =  new Flower(1.1, "Kurfer", "Phillipp", PlantColor.ORANGE);
        peterBusch = new Shrub(1.0, "Kurfer", "Peter");

        plantBed.add(phillippBlume);
        plantBed.add(peterBusch);
    }

    @Test
    void testAddPlants(){
        logger.info("Testing if adding and iterating plants is implemented correctly");
        int counter = 0;
        for(Object o : plantBed.getPlants()){
            counter++;
        }
        assertEquals(2, counter);
    }

    @Test
    void testSize(){
        logger.info("Testing if size() method is implemented correctly");
        assertEquals(2, plantBed.size());
    }

    @Test
    void testgetPlantsByColor(){
        logger.info("Testing if filtering by color is implemented correctly");
        assertEquals(1, plantBed.getPlantsByColor(PlantColor.ORANGE).size());
        assertEquals(1, plantBed.getPlantsByColor(PlantColor.GREEN).size());
        assertEquals(0, plantBed.getPlantsByColor(PlantColor.BLUE).size());
    }
}
