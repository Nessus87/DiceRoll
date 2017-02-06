package newDice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int result;
    int minResult;
    int maxResult;

    public int getResult() {
        return result;
    }

    public void setResult(int minResult, int maxResult) {
        this.result = ThreadLocalRandom.current().nextInt(minResult, maxResult + 1);
        this.minResult = minResult;
        this.maxResult = maxResult;
    }

    public String evaluation(){
        if (result > maxResult/2)
        {
            return "Nice roll!";
        } else if (result < maxResult/2)
        {
            return "Unlucky!";
        }
        else
        {
            return "Fair roll.";
        }
    }
}
