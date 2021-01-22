package future.assignment;

import org.apache.commons.lang3.StringUtils;

public class Capitalize {

    public String capitalizeWithLib(String str) {
        return StringUtils.capitalize(str);
    }

    public String[] splitWithLib(String str) {
        String capitalizedStr = capitalizeWithLib(str);
        return StringUtils.split(capitalizedStr);
    }
}
