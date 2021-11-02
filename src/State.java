package src;

/**
 * Classe para instanciar uma nova transicao
 * 
 * @author Boanerges Potyguara Saes Junior - 201821136
 */
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

  /**
   * Metodo getter para o estado da fita
   * 
   * @return estado atual da fita
   */
  public String getStateTape() {
    return stateTape;
  }

  /**
   * Metodo getter para o que o estado esta lendo
   * 
   * @return simbolo de leitura para transicao
   */
  public String getReadTape() {
    return readTape;
  }

  /**
   * Metodo getter para o proximo estado
   * 
   * @return proximo estado
   */
  public String getNextState() {
    return nextState;
  }

  /**
   * Metodo getter para simbolo que ira ser escrito na fita
   * 
   * @return simbolo que ira ser escrito na fita
   */
  public String getSymbolToWrite() {
    return symbolToWrite;
  }

  /**
   * Metodo getter para qual direcao a fita vai ir R ou L
   * 
   * @return direcao que a fita ira
   */
  public String getDirection() {
    return direction;
  }
}
