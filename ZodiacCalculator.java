import java.util.Scanner;

public class ZodiacCalculator {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String[] horoscope = {"Monkey","Rooster","Dog","Pig","Rat","Ox"
                            ,"Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
        int horoscopeIndex = year % 12;
        System.out.println("You were born in the year of the " + horoscope[horoscopeIndex]);
    }
}
