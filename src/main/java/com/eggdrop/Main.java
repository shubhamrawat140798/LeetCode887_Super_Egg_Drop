package com.eggdrop;

import java.util.InputMismatchException;
import java.util.Scanner;

final class Main {
    /**
     * for taking input from user.
     * @param args for command line arguments.
     */
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\n Enter number of floors in a building : ");
            final int floorsInBuilding = scanner.nextInt();
            System.out.print("\n Enter number of eggs : ");
            final int totalEggs = scanner.nextInt();
            EggDrop eggDropObject = new EggDrop();
            System.out.println(" Total trials: "
            +
            eggDropObject.eggsDrop(totalEggs, floorsInBuilding));

        } catch (InputMismatchException exception) {
            System.out.println("Exception occur: Input Mismatch enter Integer");
        }        catch (Exception exception) {
            System.out.println("Exception occur: ");
        }
    }
    private Main() {
        //Utility classes should not have a public or default constructor.
        // (6:1) [HideUtilityClassConstructor]
    }
}
