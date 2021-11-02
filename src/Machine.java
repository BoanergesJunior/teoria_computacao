package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe que faz a leitura de entrada da maquina e separa em transicoes
 *
 * @author Boanerges Potyguara Saes Junior - 201821136
 */
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

  /**
   * Metodo responsavel por ler o arquivo que contem a maquina e separa-lo em
   * estados
   *
   */
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

  /**
   * Metodo getter para o nome do arquivo que sera lido
   *
   * @return nome do arquivo
   */
  public String getInputFile() {
    return inputFile;
  }
}
