import java.util.HashMap;
import java.util.Map;

public class Bins {

    private Map<Integer, Integer> binMap = new HashMap<Integer, Integer>();

    public Bins(){
    }

    public Bins(Integer minBin, Integer maxBin){
        for (Integer i = minBin; i <= maxBin; i++){
            this.binMap.put(i, 0);
        }
    }

    public Map<Integer, Integer> getBinMap(){
        return this.binMap;
    }

    public Integer getBinsValue(Integer binNumber){
        return this.binMap.get(binNumber);
    }

    public void incrementBin(Integer binNumber){
        Integer valuePlusOne = getBinsValue(binNumber) + 1;
        this.binMap.replace(binNumber, valuePlusOne);
    }



}
