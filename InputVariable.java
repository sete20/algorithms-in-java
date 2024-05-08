import java.util.Scanner;

public class InputVariable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, area;

        System.out.println("please enter rectangle length");
        length = input.nextInt();

        System.out.println("please enter rectangle width");
        width = input.nextInt();

        area = length * width;
        System.out.println(area);

    }
}
