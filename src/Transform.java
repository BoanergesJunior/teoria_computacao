package src;

import java.util.ArrayList;

/**
 * Classe que transforma a linguagem unaria em linguagem de humana
 *
 * @author Boanerges Potyguara Saes Junior - 201821136
 */
public class Transform {

  ArrayList<String> transformed = new ArrayList<>();
  String partialTransaction = "";
  String stateTape;
  String readTape;
  String nextState;
  String symbolToWrite;
  String direction;

  Transform(State transaction) {
    this.stateTape = transaction.getStateTape();
    this.readTape = transaction.getReadTape();
    this.nextState = transaction.getNextState();
    this.symbolToWrite = transaction.getSymbolToWrite();
    this.direction = transaction.getDirection();

    parseAll();
  }

  /**
   * Metodo que chama todos os parsers
   * 
   */
  public void parseAll() {
    parseStateTape();
    parseReadTape();
    parseNextState();
    parseSymbolToWrite();
    parseDirection();
    print();
  }

  /**
   * Metodo transforma o estado atual da fita
   * 
   */
  public void parseStateTape() {
    switch (stateTape) {
    case "1":
      partialTransaction += "δ(q0, ";
      break;
    case "11":
      partialTransaction += "δ(q1, ";
      break;
    case "111":
      partialTransaction += "δ(q2, ";
      break;
    case "1111":
      partialTransaction += "δ(q3, ";
      break;
    case "11111":
      partialTransaction += "δ(q4, ";
      break;
    }
  }

  /**
   * Metodo transforma a leitura da fita
   * 
   */
  public void parseReadTape() {
    switch (readTape) {
    case "1":
      partialTransaction += "A) = ";
      break;
    case "11":
      partialTransaction += "B) = ";
      break;
    case "111":
      partialTransaction += "C) = ";
      break;
    case "1111":
      partialTransaction += "D) = ";
      break;
    case "11111":
      partialTransaction += "E) = ";
      break;
    }
  }

  /**
   * Metodo transforma o proximo estado
   * 
   */
  public void parseNextState() {
    switch (nextState) {
    case "1":
      partialTransaction += "[q0, ";
      break;
    case "11":
      partialTransaction += "[q1, ";
      break;
    case "111":
      partialTransaction += "[q2, ";
      break;
    case "1111":
      partialTransaction += "[q3, ";
      break;
    case "11111":
      partialTransaction += "[q4, ";
      break;
    }
  }

  /**
   * Metodo transforma o simbolo de leitura
   * 
   */
  public void parseSymbolToWrite() {
    switch (symbolToWrite) {
    case "1":
      partialTransaction += "0, ";
      break;
    case "11":
      partialTransaction += "1, ";
      break;
    case "111":
      partialTransaction += "B, ";
      break;
    }
  }

  /**
   * Metodo transforma a direcao que o estado vai
   * 
   */
  public void parseDirection() {
    switch (direction) {
    case "1":
      partialTransaction += "L]";
      break;
    case "11":
      partialTransaction += "R]";
      break;
    }
  }

  public void print() {
    System.out.println(partialTransaction);
  }

}
