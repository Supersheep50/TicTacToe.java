// Jons Version of console Tic Tac Toe


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array to keep track of board position
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',};

        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Enter a position: ");
            input = scanner.nextInt();
            pos[input - 1] = 'X';

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");


        }
    }
}
// sample game board
//   |   |
//----------
//   |   |
//----------
//   |   |