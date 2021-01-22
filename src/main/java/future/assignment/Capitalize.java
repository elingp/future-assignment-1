package future.assignment;

import org.apache.commons.lang3.StringUtils;

public class Capitalize {

    public static String capitalizeWithLib(String str) {
        return StringUtils.capitalize(str);
    }

    public static String[] splitWithLib(String str) {
        String capitalizedStr = capitalizeWithLib(str);
        return StringUtils.split(capitalizedStr);
    }
}
