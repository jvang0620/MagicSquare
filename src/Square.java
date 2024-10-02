import java.util.Scanner;

public class Square {

    private int[][] square;

    // --------------------------------------
    // create new square of given size
    // --------------------------------------
    public Square(int size) {
        square = new int[size][size];

    }

    // --------------------------------------
    // create new square using given 2D array
    // --------------------------------------
    public Square(int[][] matrix) {
        square = matrix;

    }

    // --------------------------------------
    // return the square 2D array
    // --------------------------------------
    public int[][] getSquare() {
        return square;
    }

    // --------------------------------------
    // return the sum of the values in the given row
    // --------------------------------------
    public int sumRow(int row) {

        int totalColumns = 0;
        for (int column = 0; column < square[0].length; column++) {
            totalColumns = totalColumns + square[row][column];
        }
        return totalColumns;

    }

    // --------------------------------------
    // return the sum of the values in the given column
    // --------------------------------------
    public int sumColumn(int col) {

        int totalRows = 0;
        for (int row = 0; row < square.length; row++) {
            totalRows = totalRows + square[row][col];
        }

        return totalRows;
    }

    // --------------------------------------
    // return the sum of the values in the main diagonal
    // --------------------------------------
    public int sumMainDiag() {

        int totalSumOfTheMainDiagonals = 0;
        for (int index = 0; index < square.length; index++) // traverse through the 2D Array/Matrix
        {
            totalSumOfTheMainDiagonals = totalSumOfTheMainDiagonals + square[index][index]; // Take element of the
                                                                                            // matrix where row #/
                                                                                            // Column #
        } // are equal and set them to total sum of the main diaglog
        return totalSumOfTheMainDiagonals; // return total sum of the main diaglog
    }

    // --------------------------------------
    // return the sum of the values in the other ("reverse") diagonal
    // --------------------------------------
    public int sumOtherDiag() {

        int totalSumOfTheReverseDiagonals = 0;
        for (int index = 0; index < square.length; index++) // traverse through the 2D Array/Matrix, setting position of
                                                            // array as int index
        {
            totalSumOfTheReverseDiagonals += square[index][square.length - 1 - index];
        }
        return totalSumOfTheReverseDiagonals;
    } // end of method

    // --------------------------------------
    // return true if the square is magic (all rows, cols, and diags have
    // same sum), false otherwise
    // --------------------------------------
    public boolean isMagic() {

        boolean answer = true; // set answer to true
        int sumOfTheMainDigonal = sumMainDiag(); // set the sum of Main diagonal method to int sumOfTheMainDigonal.
        if (sumOtherDiag() != sumOfTheMainDigonal) // if the sum of the other diagonal IS NOT EQUAL to the sum of the
                                                   // main digonal
        {
            answer = false; // set answer to false
        } else // however
        {
            for (int index = 0; index < square.length; index++) {
                if (sumOfTheMainDigonal != sumColumn(index)) // if the sum of the main digonal IS NOT EQUAL to the sum
                                                             // of the colum index
                {
                    answer = false; // set answer to false
                }
            }
            for (int index = 0; index < square.length; index++) {
                if (sumOfTheMainDigonal != sumRow(index)) // if the sum of the main digonal IS NOT EQUAL to the sum of
                                                          // the row's indexs
                {
                    answer = false; // set answer to false
                }
            }
        }
        return answer; // otherwise, return true since everything is equal to each other

    }

    // --------------------------------------
    // read info into the square from the standard input.
    // --------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.println("Enter an integer number");
                square[row][col] = scan.nextInt();
            }
        }
    }

    // --------------------------------------
    // print the contents of the square, neatly formatted
    // --------------------------------------
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "  ");
            }
            System.out.println("");
        }

    }

} // end of class
