import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY ALPHABET");
        char alph = sc.next().charAt(0);
        if (alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u') {
            if (alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U') {
                System.out.println("GIVEN ALPHABET IS VOWEL");
            } else {
                System.out.println("GIVEN IS CONSONANT");
            }
        } else {
            System.out.println("GIVEN IS CONSONANT");
        }
        sc.close();
    }
}
