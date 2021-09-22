import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Machine {

  String line = "";
  String inputFile = "";
  String outputFile = "";
  Scanner file;
  HandleStates handleStates;
  BufferedReader buffer;

  Machine(String inputFile, String outputFile) {
    this.inputFile = inputFile;
    this.outputFile = outputFile;
    handleStates = new HandleStates();
  }

  public void readFile() {

    try {
      FileReader reader = new FileReader(getInputFile());
      buffer = new BufferedReader(reader);

      while (buffer.ready()) {
        line = buffer.readLine();
        handleStates.setListStates(line);
      }

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String getInputFile() {
    return inputFile;
  }
}
