package future.assignment;

import java.util.Scanner;
import java.lang.*;

public class Capitalization {
    static void capitalizeWithoutLib(String inString){
        StringBuilder outString1 = new StringBuilder("[");
        StringBuilder outString2 = new StringBuilder("");
        boolean isNeedToBeCapital = true;
        for (int i = 0; i<inString.length(); ++i){
            char c = inString.charAt(i);
            if (c==' '){
                isNeedToBeCapital = true;
                outString1.append(", ");
                outString2.append(c);
            }
            else{
                boolean isLowerCaseAlphabet = ((int)c >= 96 && (int)c <=122);
                if (isNeedToBeCapital && isLowerCaseAlphabet) {
                    c = (char)((int)c - 32);
                    outString1.append(c);
                    outString2.append(c);
                }
                else{
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

    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input");

        String inString = myObj.nextLine();  // Read user input
        capitalizeWithoutLib(inString);  // Output user input
    }
}
