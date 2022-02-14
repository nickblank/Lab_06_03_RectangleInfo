import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int width;
        int length;
        int area;
        int per;
        double diagonal;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle: ");
        length = userIn.nextInt();

        System.out.println("Enter the width of the Rectangle: ");
        width = userIn.nextInt();

        area = length * width;
        per = (width * 2) + (length * 2);
        diagonal = (length * length) + (width * width);
        diagonal = Math.sqrt(diagonal);

        System.out.println("The area is " + area + ", and the perimeter is " + per + ".");
        System.out.println("The diagonal is " + diagonal + ".");
    }
}
