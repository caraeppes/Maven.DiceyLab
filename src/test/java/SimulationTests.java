import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class SimulationTests {

    @Test
    public void SimulationTest(){
        // Given
        Integer numberOfDice = 2;
        Integer numberOfTosses = 10;
        Integer expectedMaxBin = 12;
        Integer expectedMinBin = 2;

        // When
        Simulation sim = new Simulation(numberOfDice, numberOfTosses);
        Integer actualMaxBin = sim.getMaxBins();
        Integer actualMinBin = sim.getMinBins();
        Integer actualTosses = sim.getNumberOfTosses();

        // Then
        Assert.assertEquals(expectedMaxBin, actualMaxBin);
        Assert.assertEquals(expectedMinBin, actualMinBin);
        Assert.assertEquals(numberOfTosses, actualTosses);
    }

    @Test
    public void runSimulationTest(){
        // Given
        Simulation sim = new Simulation(2,5);

        // When
        sim.runSimulation();
        Collection<Integer> actualValues = sim.getBins().getBinMap().values();
        Integer rollsCountedInBins = 0;
        for (Integer value : actualValues){
            rollsCountedInBins = rollsCountedInBins + value;
        }

        // Then
        Assert.assertEquals(new Integer(5), rollsCountedInBins);
    }

    @Test
    public void printResultsTest(){
        Simulation sim = new Simulation(4, 10000);
        sim.runSimulation();
        sim.printResults();
    }

}
