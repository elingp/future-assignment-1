package future.assignment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
//        String arg = args[0];
        Scanner in = new Scanner(System.in);
        String arg = in.nextLine();
        String capitalizedArg = Capitalize.capitalizeWithLib(arg);
        String[] splittedArg = Capitalize.splitWithLib(capitalizedArg);
        System.out.println(Arrays.stream(splittedArg).
                map(s -> "\"" + s + "\"").
                collect(Collectors.toList()));
        System.out.println(capitalizedArg);
    }
}
