import java.util.Scanner;

public class WeekSevThree {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Say something: ");
            String user_input = input.nextLine();
            System.out.println("The number of vowels in the your input is "+countVowels(user_input));

            System.out.println("Do you want to continue? YES or NO");
            String user_decision = input.nextLine();
            if (user_decision.equalsIgnoreCase("NO")){
                break;
            }
        }

    }

    //iterative method
    public static int countVowels(String user_input){
        String modified_input = user_input.toLowerCase();
        int count = 0;
        for (int i = 0; i < user_input.length(); i++) {
            if (isVowel(modified_input.charAt(i))==1){
                count++;
            }
        }
        return count;
    }

    //recursive method
    public static int isVowel(char c){
        if (c == 'a' ||c == 'e' ||c == 'i'||c == 'o'||c == 'u'){
            return 1;
        }else{
            return 0;
        }
    }
}
