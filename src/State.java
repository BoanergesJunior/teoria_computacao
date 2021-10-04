package src;

public class State {
  private String stateTape;
  private String readTape;
  private String nextState;
  private String symbolToWrite;
  private String direction;

  public State(String stateTape, String readTape, String nextState, String symbolToWrite, String direction) {
    this.stateTape = stateTape;
    this.readTape = readTape;
    this.nextState = nextState;
    this.symbolToWrite = symbolToWrite;
    this.direction = direction;
  }

  public String getStateTape() {
    return stateTape;
  }

  public String getReadTape() {
    return readTape;
  }

  public String getNextState() {
    return nextState;
  }

  public String getSymbolToWrite() {
    return symbolToWrite;
  }

  public String getDirection() {
    return direction;
  }
}
