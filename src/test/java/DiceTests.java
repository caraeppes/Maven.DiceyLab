import org.junit.Assert;
import org.junit.Test;

public class DiceTests {

    @Test
    public void DiceTest(){
        // Given
        Integer expected = 5;

        // When
        Dice dice = new Dice(expected);

        // Then
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }

    @Test
    public void getNumberOfDiceTest(){
        // Given
        Integer expected = 3;
        Dice dice = new Dice(3);

        // When
        Integer actual = dice.getNumberOfDice();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest(){
    }


}
