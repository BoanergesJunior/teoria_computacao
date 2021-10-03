package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Machine {

  String line = "";
  String inputFile = "";
  String outputFile = "";
  char character;
  HandleStates handleStates;
  BufferedReader buffer;
  int count = 0;
  String state = "";

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

        character = (char) buffer.read();

        state += character;

        if (state.equals("000")) {
          state = "";
        } else if (state.length() > 2 && state.substring(state.length() - 2).equals("00")) {
          handleStates.addState(state);
          state = "";
        }
      }

      handleStates.defineStates();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String getInputFile() {
    return inputFile;
  }
}
