prints a rectangle (grid) of a chosen symbol in the consolepackage com.example;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = reader.nextInt();

        System.out.println("Enter # of columns: ");
        columns = reader.nextInt();

        System.out.println("What symbol do you want to display?");
        symbol = reader.next();

        for (int i = 1; i <=rows; i++){
            System.out.println();
            for (int j = 1; j <=columns; j++){
                System.out.print(symbol);
            }
        }
       }
    }
