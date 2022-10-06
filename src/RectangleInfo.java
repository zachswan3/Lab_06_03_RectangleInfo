import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        //Write a program that asks the user for the lengths of the sides of a rectangle. Again, check for valid input
        // and exit with an error msg if you don’t get it. Testing: use some known values to confirm that the
        // calculations are correct. E.g. 3 – 4 - 5 triangle >> 3 X 4 rectangle
        // •	The area and perimeter of the rectangle
        //•	The length of the diagonal (use the Pythagorean theorem)

        double lengthA = 0;
        double lengthB = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of side A?");
        if (scanner.hasNextDouble()){
            lengthA = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value you have entered is invalid please try again. " +trash);
            System.exit(0);
        }
        System.out.println("What is the length of side B?");
        if (scanner.hasNextDouble()){
            lengthB = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value you have entered is invalid please try again. " + trash);
            System.exit(0);
        }

        area = lengthA * lengthB;

        perimeter = lengthA + lengthA +lengthB + lengthB;

        diagonal = Math.sqrt(lengthA * lengthA + lengthB * lengthB);

        System.out.printf("The area of the rectangle is %.2f%nThe perimeter of your rectangle is %.2f%nThe diagonal of your rectangle is %.2f%n",area,perimeter,diagonal);



    }
}
