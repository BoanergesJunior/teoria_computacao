package src;

import java.util.ArrayList;

/**
 * Classe que controla os estados
 *
 * @author Boanerges Potyguara Saes Junior - 201821136
 */
public class HandleStates {

  ArrayList<String> states;
  ArrayList<State> splittedStates;
  ArrayList<Transform> transformed;
  String partsOfState[];
  State state;
  Transform transform;

  public HandleStates() {
    states = new ArrayList<>();
    splittedStates = new ArrayList<>();
  }

  /**
   * Metodo para adicionar uma transicao lida
   *
   * @param state Lista de estados
   */
  public void addState(String state) {
    states.add(state);
  }

  // public void printListStates() {
  // for (String s : states) {
  // System.out.println(s);
  // }
  // }

  /**
   * Metodo que separa o que cada parte da linguagem unaria significa ex: 11 11
   * 1111 11 1 (q1, B) = [q3, B, R]
   *
   */
  public void defineStates() {
    for (String s : states) {
      partsOfState = s.split("0");
      state = new State(partsOfState[0], partsOfState[1], partsOfState[2], partsOfState[3], partsOfState[4]);
      splittedStates.add(state);
    }
    transformTransactions();
    // printSplittedStates();
  }

  // public void printSplittedStates() {
  // for (State s : splittedStates) {
  // System.out.print(s.getStateTape() + " " + s.getReadTape() + " " +
  // s.getNextState() + " " + s.getSymbolToWrite()
  // + " " + s.getDirection());
  // System.out.println();
  // }
  // }

  public void transformTransactions() {
    for (State transaction : splittedStates) {
      transform = new Transform(transaction);
    }
  }
}