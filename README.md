
public class Dice {
    private  int RollCount1;
      private  static int RollCount2;
      
        public Dice() {
              RollCount1 = 0;
            	RollCount2 = 0;
        }
        
        public  int RollDice1(int DiceNumber, int Max) {
              	int dice;
                dice = 1 + (int) (Math.random() * Max * DiceNumber);
                RollCount1 = RollCount1 + DiceNumber;
                return dice;
        }
        
        public  static int RollDice2(int DiceNumber, int Max) {
          	int dice;
            dice = 1 + (int) (Math.random() * Max * DiceNumber);
            RollCount2 = RollCount2 + DiceNumber;
            return dice;
    }
          
        public int RollCount1() {
            return RollCount1;
        }
        public static int RollCount2() {
            return RollCount2;
        }
        public static int Roll_1_Dice() {
                int computerNum;
                computerNum = 1 + (int) (Math.random() * 6);
                RollCount2 ++;
                return computerNum;
        }
}
