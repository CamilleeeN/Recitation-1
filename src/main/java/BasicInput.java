import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar;
        String userString = " ";

        // TODO Define char and string variables similarly

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        String Face = scnr.next();
        userChar= Face.charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();
        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        //python: print()
        //java; System.out.println()

        System.out.println(userInt+ " "+userDouble+" "+userChar+" "+ userString);

        // TODO (2): Output the four values in reverse
        System.out.println(userString+" " +userChar+" "+userDouble+" "+userInt);

        // TODO (3): Cast the double to an integer, and output that integer

        System.out.println(userDouble + "cast to an integer is"+(int)userDouble);


    }
}