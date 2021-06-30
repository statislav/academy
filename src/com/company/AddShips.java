package com.company;

import java.util.Arrays;

public class AddShips {
    public static void inputText(int i) {
        String[] nameShip = {"Aircraft Carrier ", "Battleship ", "Submarine ", "Cruiser", "Destroyer"};
        for (int j = 5; j >= 0; j--) {
            if (i == j) {
                System.out.print("Enter the coordinates of the " + nameShip[nameShip.length - j] + " (" + i + " cells):\n");
            }
        }
    }
    public static void inputText1(int i) {
        String[] nameShip = {"Aircraft Carrier ", "Battleship ", "Submarine ", "Cruiser", "Destroyer"};
        for (int j = 5; j >= 0; j--) {
            if (i == j) {
                System.out.print("Error! Wrong length of the " + nameShip[nameShip.length - j] + "! Try again:\n");
            }
        }
    }

    public static void addShipsOnField(short startOfFirstCoordinates, short startOfTwoCoordinates, short endOfFirstCoordinates, short endOfTwoCoordinates, String[][] array) {
        char[] al = Battleship.verticalMarkup();
        Battleship.HorizontalMarkup();
        short startTwo = (short) (startOfTwoCoordinates - 1);
        short endTwo = (short) (endOfTwoCoordinates - 1);
        int countHorizontales = startTwo;
        int countHorizontales_1 = startTwo;
        int countVertical = startOfFirstCoordinates;
        int countVertical_1 = startOfFirstCoordinates;

        while (countHorizontales <= endTwo) {
            array[startOfFirstCoordinates][countHorizontales] = "O";
            countHorizontales++;
        }
        while (countHorizontales_1 >= endTwo) {
            array[endOfFirstCoordinates][countHorizontales_1] = "O";
            countHorizontales_1--;
        }
        while (countVertical <= endOfFirstCoordinates) {
            array[countVertical][startTwo] = "O";
            countVertical++;
        }
        while (countVertical_1 >= endOfFirstCoordinates) {
            array[countVertical_1][startTwo] = "O";
            countVertical_1--;
        }
        showArray(array, al);
    }

    public static void showArray(String[][] array, char[] al) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(al[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }

    // Tests for a project
    public static String test(String s) {
        return s.substring(7);
    }

    public static int test1(String s) {
        return Integer.parseInt(s.substring(5));
    }

    public static short test2(int i, int k) {
        return (short) Math.abs(i - k);
    }

    public static String testArray(boolean[][] array, int i0, int i1, int i2, int i3) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i0][i1] || !array[i2][i3]){
                    return "No";
                }
            }
        }
        return "Yes";
    }
}
