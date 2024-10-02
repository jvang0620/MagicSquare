# Magic Square Application

## Description

The Magic Square application is a Java program that allows users to create and analyze a square matrix. It determines whether the matrix is a magic square, which is defined as a square where the sums of all rows, columns, and both diagonals are the same.

## Features

- Input a square matrix of any size.
- Calculate and display the sum of each row.
- Calculate and display the sum of each column.
- Calculate and display the sums of both diagonals.
- Check if the square is a magic square.

## Classes

### Main

The `Main` class contains the `main` method, which serves as the entry point for the application. It handles user input and orchestrates the operations of the `Square` class.

#### Methods

- `public static void main(String[] args)`: The main method that executes the program. It prompts the user for input, creates a square, and displays various properties of the square.

### Square

The `Square` class represents a square matrix and provides methods to perform various operations on the matrix.

#### Constructors

- `public Square(int size)`: Creates a new square of the specified size.
- `public Square(int[][] matrix)`: Creates a new square using the provided 2D array.

#### Methods

- `public int[][] getSquare()`: Returns the 2D array representing the square.
- `public int sumRow(int row)`: Returns the sum of the values in the specified row.
- `public int sumColumn(int col)`: Returns the sum of the values in the specified column.
- `public int sumMainDiag()`: Returns the sum of the values in the main diagonal.
- `public int sumOtherDiag()`: Returns the sum of the values in the other diagonal.
- `public boolean isMagic()`: Returns `true` if the square is a magic square, `false` otherwise.
- `public void readSquare(Scanner scan)`: Reads integer values into the square from standard input.
- `public void printSquare()`: Prints the contents of the square in a formatted manner.

## Usage

1. Compile the Java files.
2. Run the `Main` class.
3. Enter an integer for the size of the square when prompted.
4. Input the integers for each cell in the square as requested.
5. The program will display the square, the sums of the rows and columns, the diagonal sums, and whether the square is a magic square.

   ## Example

   ```
   Enter an integer number for the size of the square 3 Enter an integer number 4 Enter an integer number 9 Enter an integer number 2 Enter an integer number 3 Enter an integer number 8 Enter an integer number 1 Enter an integer number 6 Enter an integer number 7 ******** Square ******** 4 9 2
   3 5 7
   8 1 6
   ******** Square details ******** Row 0 sum: 15 Row 1 sum: 15 Row 2 sum: 15 Column 0 sum: 15 Column 1 sum: 15 Column 2 sum: 15 Main diagonal sum: 15 Other diagonal sum: 15 This 2D array is a magic square
   ```

## Requirements

- Java Development Kit (JDK) 8 or later
- A Java IDE or text editor to edit and run the code

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Jai Vang
