import java.util.Scanner;

public class WeekSevTwo {
    public static String[] my_arr = {"Ray" ,"Day" ,"May" ,"Kat" ,"Kit" ,"Bot" ,"Tom" ,"Tim" ,"Tom" ,"Ken" ,"Ben" ,"Den" ,"101" ,"92" ,"12"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean decision = true;

        System.out.println("Type your first name:");
        String name = input.nextLine();
        linearSearch(my_arr,name);

        while (decision){
            System.out.println("Do you want to continue? YES or NO");
            String user_decision = input.nextLine();
            if (user_decision.equalsIgnoreCase("NO")){
                decision = false;
            } else {
                System.out.println("Type your second name:");
                String another_name = input.nextLine();
                linearSearch(my_arr,another_name);
            }
        }
    }
    public static void linearSearch(String[]arr, String target_element){
        int count = 0;
        for (String each_index:arr) {
            if ( each_index.equalsIgnoreCase(target_element)){
                count++;
            }
        }
        String prompt = (count>0)? target_element+" exits in the given array." : target_element+" does not exit in the given array.";
        System.out.println(prompt);
    }

}
