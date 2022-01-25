import java.util.Arrays;
import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        String[] number = input.nextLine().split(" ");
        float[] numberConverted = new float[3];
        float sum = 0;
        for( int i = 0; i < number.length; i++){
            numberConverted[i] = Integer.parseInt(number[i]);
            sum += numberConverted[i];
        }
        sum = sum / number.length;
        System.out.println("The average of " + String.join(" ", number) + " is " + sum );
    }
}
