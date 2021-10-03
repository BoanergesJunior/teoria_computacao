package src;

import java.util.ArrayList;

public class HandleStates {

  ArrayList<String> states;
  ArrayList<State> splitStates;
  String partsOfState[];
  State state;

  public HandleStates() {
    states = new ArrayList<>();
    splitStates = new ArrayList<>();
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
      splitStates.add(state);
    }
  }
}