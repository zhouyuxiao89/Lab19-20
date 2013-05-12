
public class TripleDice extends Dice{
  private  int RollCount;
  public TripleDice()
  {
    RollCount = 0;
  }
  public int RollDice1(int Max) {
	int DiceNumber = 3;
  	int dice;
  	dice = 1 + (int) (Math.random() * Max * DiceNumber);
  	RollCount = RollCount + DiceNumber;
  	return dice;
  }
 
  public int getCount() {
      return RollCount;
  }
  public int Reset()
  {
	  return RollCount = 0;
  }
  public void showRollCount()
  {
	  System.out.printf("The times the dice1 rolled for public method is %d\n\n",getCount());
  }
}

