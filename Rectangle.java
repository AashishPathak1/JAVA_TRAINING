import java.util.Scanner;

public class Rectangle {

static float perimeter(float ln , float bdth){
    return (2*(ln+bdth));
}

static float area (float ln, float bdth){
    return(ln*bdth);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        float ln=sc.nextFloat();
        System.out.println("Enter the breadth of rectangle:");
        float bdth=sc.nextFloat();
        float result_perimeter=perimeter(ln, bdth);
        float result_area =area(ln,bdth);
        System.out.println(result_perimeter);
        System.out.println(result_area);

    }
}
