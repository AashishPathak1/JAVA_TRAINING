import java.util.Scanner;

public class LowerUpper {
    static String ConversionText(String word) {
        String output="";
        int num = word.length();
       for (int i = 0; i < num; i++) {   
            char value1 = word.charAt(i);
        if (Character.isLowerCase(value1)) {
            output+=Character.toUpperCase(value1);
        }
        else if (Character.isUpperCase(value1)) {
            output += Character.toLowerCase(value1);
        }
         else {
           output+= Character.toUpperCase(value1);
        }
    }
    return output;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();

        String Res = ConversionText(word);
        System.out.println(Res);

    }
}
