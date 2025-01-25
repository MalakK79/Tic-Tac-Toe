import java.util.Arrays;
import java.util.Scanner;
//Tiktaktoe
//Two-player game 

public class Lab11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] matrix = {
                {"_", "_", "_" },
                {"_", "_", "_" },
                {"_", "_", "_" }
        };
        Print2dString(matrix);

        int count = 0;
        String Move;
        while (count<10) {
            if (count%2 == 0) {
                Move = "X";
            } else {
               Move = "O";
            }
            System.out.print(Move + " goes" + "\nEnter row: ");
            int r = in.nextInt();
            System.out.print("Enter column: ");
            int c = in.nextInt();
            matrix[r][c] = Move;
            Print2dString(matrix);
            //String move = Move;
            if (count>8) {
                System.out.println("Tie!");
                System.exit(0);
            } else {
                if(checkWinner(matrix, Move)) {
                    System.exit(0);
                }
            }

            //if x wins
            count++;


        }

    }
    public static void Print2dString(String [][] StringArray){
        // prints the matrix
        for (int i = 0; i < StringArray.length; i++){
            for (int j = 0; j < StringArray[i].length; j++) {


                System.out.print(StringArray[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean checkWinner(String [][] matrix, String move ){
    for (int i = 0; i<3; i++){
        if (matrix[0][i].equals(move) && matrix[1][i].equals(move) && matrix[2][i].equals(move)) {
            System.out.println(move + " wins!");
            return true;
        }
        if (matrix[i][0].equals(move) && matrix[i][1].equals(move) && matrix[i][2].equals(move)) {
            System.out.println(move + " wins!");
            return true;
        }

    }
    if (matrix[0][0].equals(move) && matrix[1][1].equals(move) && matrix[2][2].equals(move)) {
        System.out.println(move + " wins!");
        return true;
    }
        if (matrix[0][2].equals(move) && matrix[1][1].equals(move) && matrix[2][0].equals(move)) {
            System.out.println(move + " wins!");
            return true;
        }

        return false;
    }



}
