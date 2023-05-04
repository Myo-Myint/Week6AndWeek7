public class WeekSevFour {
    public static void main(String[] args) {
        System.out.println(replaceChar("Hello World",'l','z'));
    }

    public static String replaceChar(String target_string, char target_char, char desired_char){
        if (target_string.length()==1){
            return target_string;
        }

        char x = target_string.charAt(0);
        if (target_string.charAt(0)==target_char){
            x = desired_char;
            target_string = x+target_string.substring(1);
        }
        return x+replaceChar(target_string.substring(1),target_char,desired_char);


    }
}
