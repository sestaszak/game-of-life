package edu.macalester.comp124.life;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */

/*
If a living cell has less than 2 living neighbors, it will die (of loneliness).
If a living cell has more than 3 living neighbors, it will die (it’s overcrowded).
If a dead cell has exactly 3 living neighbors, it will come to life (it is born).
Otherwise, the cell’s value will not be changed.

In addition, a dead cell with 6 living neighbors will come to life.
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "HighLife Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive==true && (neighborCount<2 || neighborCount>3)) {
            return false;
        } else if (isAlive==false && (neighborCount==3 || neighborCount==6)) {
            return true;
        } else {
            return isAlive;
        }
    }

        /*
        return true;

         */
}























