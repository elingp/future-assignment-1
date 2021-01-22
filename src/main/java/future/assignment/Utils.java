package future.assignment;

import org.apache.commons.lang3.StringUtils;

public class Utils {

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

    public static void capitalizeWithoutLib(String inString) {
        StringBuilder outString1 = new StringBuilder("[");
        StringBuilder outString2 = new StringBuilder("");
        boolean isNeedToBeCapital = true;
        for (int i = 0; i < inString.length(); ++i) {
            char c = inString.charAt(i);
            if (c == ' ') {
                isNeedToBeCapital = true;
                outString1.append(", ");
                outString2.append(c);
            } else {
                boolean isLowerCaseAlphabet = ((int) c >= 96 && (int) c <= 122);
                if (isNeedToBeCapital && isLowerCaseAlphabet) {
                    c = (char) ((int) c - 32);
                    outString1.append(c);
                    outString2.append(c);
                } else {
                    outString1.append(c);
                    outString2.append(c);
                }
                isNeedToBeCapital = false;
            }
        }
        outString1.append("]");
        System.out.println(outString1);
        System.out.println(outString2);
    }

}
