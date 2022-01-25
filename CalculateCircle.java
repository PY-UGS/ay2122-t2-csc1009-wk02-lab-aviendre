import java.util.Scanner;

public class CalculateCircle{
    public static void main(String[] args){
        final float PI = 3.14159f;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radiusValue = input.nextFloat();
        float area = (radiusValue*radiusValue*PI);
        System.out.printf("The area for the circle of radius " + radiusValue + " is " + area);
    }
}
