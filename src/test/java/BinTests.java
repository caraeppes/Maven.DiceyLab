import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class BinTests {

    @Test
    public void Bins() {
        // Given
        Bins bins = new Bins(3, 9);

        // When
        Integer actual = bins.getBinMap().get(4);
        Integer notKey = bins.getBinMap().get(2);
        Integer actualMapSize = bins.getBinMap().size();

        // Then
        Assert.assertEquals(new Integer(0), actual);
        Assert.assertNull(notKey);
        Assert.assertEquals(new Integer(7), actualMapSize);
    }

    @Test
    public void getBinsValueTest(){
        // Given
        Bins bins = new Bins(4, 44);
        Integer expected = 4;
        bins.getBinMap().replace(6, expected);

        // When
        Integer actual = bins.getBinsValue(6);
        Integer actualZeroValue = bins.getBinsValue(39);

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(new Integer(0), actualZeroValue);
    }

    @Test
    public void incrementBinTest(){
        // Given
        Bins bins = new Bins (3, 45);
        bins.getBinMap().replace(5, 12);

        // When
        bins.incrementBin(5);
        Integer actual = bins.getBinsValue(5);
        bins.incrementBin(4);
        Integer actualOne = bins.getBinsValue(4);

        // Then
        Assert.assertEquals(new Integer(13), actual);
        Assert.assertEquals(new Integer(1), actualOne);
    }

}
