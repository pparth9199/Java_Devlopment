package dungeon;

public class PlayerClass implements Player {
  private int currentPosition;
  private String name;
  
  public PlayerClass(String name) {
    this.name = name;
  }
  @Override
  public void move(String direction) {
    // TODO Auto-generated method stub

  }

  @Override
  public void pickUpTreasure(int[][] cave) {
    // TODO Auto-generated method stub

  }

  @Override
  public int[][] playerLocation() {
    // TODO Auto-generated method stub
    return null;
  }

  
  public void setPlayerLocation(int pos) {
    this.currentPosition=pos;
  }
}
