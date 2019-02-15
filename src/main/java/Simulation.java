public class Simulation {

    private Integer numberOfTosses;
    private Integer minBins;
    private Integer maxBins;
    private Bins bins;
    private Dice dice;

    public Simulation(Integer numberOfDice, Integer numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        this.minBins = numberOfDice;
        this.maxBins = numberOfDice * 6;
        this.bins =new Bins(minBins, maxBins);
        this.dice = new Dice(numberOfDice);
    }

    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults(){

        System.out.println("Simulation of " + dice.getNumberOfDice() + " dice rolled " + numberOfTosses + " times:");

        for (int i = minBins; i <= maxBins; i++){
            Integer binNumber = i;
            Integer numberOfTimesRolled = bins.getBinsValue(binNumber);
            Double percentageRolled = (double)numberOfTimesRolled / (double)numberOfTosses;

            if (i < 10) {
                System.out.print("  Number of " + i + "'s rolled  : ");
            }
            else if (i < 100){
                System.out.print(" Number of " + i + "'s rolled  : ");
            }
            else {
                System.out.print("Number of " + i + "'s rolled  : ");
            }
            System.out.printf("%7d  :  ", numberOfTimesRolled);
            System.out.printf("Percentage: %.2f ", percentageRolled);
            for (int stars = 1; stars < (percentageRolled * 100); stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }

    public Integer getMinBins() {
        return minBins;
    }

    public Integer getMaxBins() {
        return maxBins;
    }

    public Bins getBins() {
        return bins;
    }
/*
    public static void main(String[] args) {
        Simulation s = new Simulation(10, 1000000);
        s.runSimulation();
        s.printResults();

    }
    */
}
