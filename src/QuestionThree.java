import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        int adult_ticket = 5;
        double child_ticket = 2.50;
        double vat = 0.2;
        boolean run_program = true;


        while (run_program){

                System.out.println("Enter the number of adults: ");
                double num_adults = input.nextDouble();
                double adult_price = adult_ticket * num_adults;

                System.out.println("Enter the number of children: ");
                double num_children = input.nextDouble();
                double children_price =  child_ticket * num_children;

                double subtotal =  children_price + adult_price;
                double total =  subtotal * vat;

                System.out.println("The total price after applying VAT 20%: "+total + " GBP");
                System.out.print("Enter 'exit' to exit the program, or press any other key to start again: ");
                String user_response = input.next();
                if (user_response.equalsIgnoreCase("exit")) {
                    run_program = false;
                    System.out.println("Program exits");
                }

        }



    }
}
