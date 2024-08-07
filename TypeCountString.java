import java.util.Scanner;

public class TypeCountString {
    public static void countTypeInString(String string) {
        String[] value = string.split(" ");
        float ifFloat;
        int ifInt;
        String ifString;
        int counter = 0;
        // count Floats
        for (String i : value) {
            try {
                ifFloat = Float.parseFloat(i);
                counter++;
                continue;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Float " + counter);

        // count ints
        counter = 0;
        for (String i : value) {
            try {
                ifInt = Integer.parseInt(i);
                counter++;
                continue;
            } catch (NumberFormatException e) {
            }

        }
        System.out.println("Int " + counter);

        // counts strings
        String stringOfStrings = string.replaceAll("[0-9.]", "");
        stringOfStrings = stringOfStrings.replaceAll("  ", " ");
        String[] value2 = stringOfStrings.split(" ");
        System.out.println("String " + value2.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        scanner.close();
        System.out.println(string);
        countTypeInString(string);
    }
}
