package rolling;

import newDice.Dice;

public class DiceRoll {
    public static void main(String[] args)
    {
        Dice die = new Dice();
        die.setResult(1, 6);
        System.out.println("First d6 roll result: " + die.getResult() + ". " + die.evaluation());
        die.setResult(1, 6);
        System.out.println("Second d6 roll result: " + die.getResult() + ". " + die.evaluation());
        die.setResult(1, 20);
        System.out.println("d20 roll result: " + die.getResult() + ". " + die.evaluation());
    }
}
