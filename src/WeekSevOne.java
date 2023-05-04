import java.util.ArrayList;

public class WeekSevOne {

    public static  int[] my_arr = {10 ,27 ,12 ,23 ,43 ,54 ,12 ,43 ,45 ,65 ,67 ,23 ,101 ,92 ,12};
    public static void main(String[] args) {

//        System.out.println(linearSearch(my_arr, 101));
        linearSearch(my_arr, 12);

    }
    public static void linearSearch(int[]arr, int target_element){
        int count = 0;
        ArrayList<Integer> index_list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==target_element){
                count++;
                index_list.add(i);
            }
        }

        if (count>0){
            System.out.println("The number(" + target_element + ") is found " + count + " times in the given array.");
            System.out.print("Index lists are ");
            for (int list:index_list) {
                System.out.print(list+"|");
            }
        }else {
            System.out.println("The target number cannot be found");
        }


    }

}
