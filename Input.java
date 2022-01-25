import java.util.Scanner;

public class Input{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println("The value inputted was " + byteValue);

        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();
        System.out.println("The value inputted was " + shortValue);

        System.out.println("Enter a int value: ");
        int intValue = input.nextInt();
        System.out.println("The value inputted was " + intValue);

        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();
        System.out.println("The value inputted was " + longValue);

        System.out.println("Enter a Float value: ");
        float floatValue = input.nextFloat();
        System.out.println("The value inputted was " + floatValue);
    }
}
