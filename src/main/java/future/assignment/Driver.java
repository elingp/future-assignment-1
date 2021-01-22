package future.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        String arg = args[0];
        System.out.println("Without Library:");
        Utils.capitalizeWithoutLib(arg);
        String capitalizedArg = Utils.capitalizeWithLib(arg);
        String[] splittedArg = Utils.splitWithLib(capitalizedArg);
        System.out.println("With Library:");
        System.out.println(Arrays.stream(splittedArg).
                map(s -> "\"" + s + "\"").
                collect(Collectors.toList()));
        System.out.println(capitalizedArg);
    }
}
