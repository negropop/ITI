
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter width of image");
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();

        System.out.println("Enter height of image");
        int height = input.nextInt();
        if (width > height) {
            System.out.println("The image is in portrait mode");

        } else {
            System.out.println("The image is in landscape mode");

        }

    }
}