package future.assignment;

import org.apache.commons.lang3.StringUtils;

public class Capitalize {

    public static String capitalizeWithLib(String str) {
        String[] words = StringUtils.split(str);
        for (int i = 0; i < words.length; i++) {
            words[i] = StringUtils.capitalize(words[i]);
        }
        return StringUtils.join(words, " ");
    }

    public static String[] splitWithLib(String str) {
        return StringUtils.split(str);
    }
}
