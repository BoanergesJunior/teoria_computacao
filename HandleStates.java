import java.util.ArrayList;

public class HandleStates {

  ArrayList<String> states;
  String line;

  HandleStates() {
    states = new ArrayList<>();
    line = "";
  }

  public void splitStates() {
    for (String line : states) {
      System.out.println(line);
    }
  }

  public void setListStates(String state) {
    states.add(state);
  }
}
