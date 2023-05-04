import java.util.Scanner;

public class QuestionTwo {

    public static int rollDice(int MIN, int MAX){ return MIN + (int)( Math.random()*( MAX - MIN ));}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        int min_dice = 1,  max_dice = 6, score = 0;

        for (int i = 0; i < 5; i++) {
            int greenDice = rollDice(min_dice, max_dice);
            int redDice = rollDice(min_dice, max_dice);
            if (greenDice != redDice) {
                score = score + redDice - greenDice;
                if (score<0){
                    score = 0;
                }
            } else {
                score = 0;
            }

            System.out.println("This is "+ i + " time" + "green: " + greenDice + ", red: " + redDice + ", score: " + score);
        }
    }
}
