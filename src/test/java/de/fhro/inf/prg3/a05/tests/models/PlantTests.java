package de.fhro.inf.prg3.a05.tests.models;

import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.PlantColor;
import de.fhro.inf.prg3.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlantTests {

    private final Logger logger = LogManager.getLogger();

    @Test
    void shrubsAlwaysGreen(){
        logger.info("Testing if a newly created Shrub is green");
        Shrub shrub = new Shrub(1.0, "Kurfer", "Peter");
        assertEquals(PlantColor.GREEN, shrub.getColor());
    }

    @Test
    void cantConstructGreenFlower(){
        logger.info("Verifying that it is impossible to construct a flower with green color");
        assertThrows(IllegalArgumentException.class, () -> new Flower(1.1, "Kurfer", "Phillipp", PlantColor.GREEN));
    }

}
