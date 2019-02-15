import java.util.Random;

public class Dice {

    private Integer numberOfDice;

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer rollDie(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (int i = 0; i < numberOfDice; i++){
            sum += rollDie();
        }
        return sum;
    }
}
