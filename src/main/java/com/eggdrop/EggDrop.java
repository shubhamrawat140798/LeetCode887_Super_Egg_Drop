package com.eggdrop;

/**
 * for determining minimum number to trail for egg drop test.
 */
public class EggDrop {
    /**
     * it will provide minmum number of trail for egg drop test.
     * @param totalEggs for storing total number of eggs for trails.
     * @param floorsInBuilding for storing total number of floors in a building.
     * @return it will return minimum trails (Integer) as an output.
     */
    final int eggsDrop(final int totalEggs,
        final int floorsInBuilding) {
        // for best case.
        // number of floors is 1 or 0.
        if ((floorsInBuilding == 0
            || floorsInBuilding == 1) && totalEggs > 0) {
            return floorsInBuilding;
        }
        // if number of eggs is 1.
        if (totalEggs == 1) {
            return floorsInBuilding;
        } else if (totalEggs < 1) { // if no egg is there to test.

            return 0;
        }
        // intial taking trails as Maximum.
        int minimumTrails = Integer.MAX_VALUE;
        int result;
        // recursive calling
        for (int floor = 1; floor <= floorsInBuilding; floor++) {
            result = Math.max(eggsDrop(totalEggs - 1, floor - 1),
                    eggsDrop(totalEggs, floorsInBuilding - floor));
            if (result < minimumTrails) {
                minimumTrails = result;
            }
        }
        minimumTrails += 1;
        return minimumTrails;
    }
}
