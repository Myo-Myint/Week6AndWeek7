import java.util.Scanner;

public class QuestionOne {

    public static double calculateArea(double radius, double PI){return PI*radius*radius;}

    public static void main(String[] args) {

        final double PI = Math.PI;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("The following program is to calculate the area of a circle, therefore only numbers are acceptable");
        System.out.println("Enter the radius value: ");

        boolean sentinel_value = keyboard.hasNextDouble();

        while (sentinel_value){
            double radius = Double.parseDouble(keyboard.nextLine());
            double area = calculateArea(radius,PI);
            System.out.println("The area of the circle is " + area);

            System.out.println("Enter the next radius value: ");
            sentinel_value = keyboard.hasNextDouble();
        }
        keyboard.close();
        System.out.println("Program exits because you put the wrong type of input. Please put numbers only!");

    }

}
