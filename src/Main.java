package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    String inputFile, outputFile;

    // System.out.print("Arquivo de entrada .txt: ");
    inputFile = "./src/input.txt";
    // inputFile = in.next();

    // System.out.print("Arquivo de saida .txt: ");
    outputFile = "output.txt";
    // outputFile = in.next();

    Machine machine = new Machine(inputFile, outputFile);
    machine.readFile();

    in.close();
  }
}
