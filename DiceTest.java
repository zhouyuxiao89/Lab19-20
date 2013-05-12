import java.util.Scanner;
public class DiceTest {
  
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
         //we cannot override the static method,
         //the compiler will generate error.
         TripleDice dice1 = new TripleDice();
         
         int a = dice1.RollDice1(10);
         System.out.printf("The dice is %d\n", a);
         int b = dice1.RollDice1(10);
         System.out.printf("The dice is %d\n", b);
         int c = dice1.RollDice1(10);
         System.out.printf("The dice is %d\n", c);
         
         //Test triple dices roll times
         dice1.showRollCount();
       
         //Test triple dices roll times after using Reset method
         dice1.Reset();
         dice1.showRollCount();
    }
}
