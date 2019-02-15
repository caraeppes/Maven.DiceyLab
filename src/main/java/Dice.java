import java.util.Random;

public class Dice {

    Integer numberOfDice;

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
        return random.nextInt(5) + 2;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (int i = 0; i < numberOfDice; i++){
            sum += rollDie();
        }
        return sum;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(5);
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());
        System.out.println(dice.rollDie());

        System.out.println(dice.tossAndSum());
        System.out.println(dice.tossAndSum());
        System.out.println(dice.tossAndSum());
    }
}
