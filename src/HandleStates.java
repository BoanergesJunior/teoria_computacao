package src;

import java.util.ArrayList;
import java.util.HashMap;

public class HandleStates {

  ArrayList<String> states;
  ArrayList<State> splittedStates;
  String partsOfState[];
  State state;
  int index;

  public HandleStates() {
    states = new ArrayList<>();
    splittedStates = new ArrayList<>();
    index = 0;
  }

  public void addState(String state) {
    states.add(state);
  }

  public void printListStates() {
    for (String s : states) {
      System.out.println(s);
    }
  }

  public void defineStates() {
    for (String s : states) {
      partsOfState = s.split("0");
      state = new State(partsOfState[0], partsOfState[1], partsOfState[2], partsOfState[3], partsOfState[4]);
      splittedStates.add(state);
    }
    print();
  }

  public void print() {
    for (State s : splittedStates) {
      System.out.print(s.getStateTape() + " " + s.getReadTape() + " " + s.getNextState() + " " + s.getSymbolToWrite()
          + " " + s.getDirection());
      System.out.println();
    }
  }

}