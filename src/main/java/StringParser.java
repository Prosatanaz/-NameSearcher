import org.jetbrains.annotations.NotNull;

import java.util.*;


public class StringParser {
    public static ArrayList<String> StringParser(@NotNull ArrayList<String> dataArray) {
        ArrayList<String> names = new ArrayList<>();
        for (String data : dataArray) {
            String delimeter = " ";
            int i = 0;
            String[] subStr;
            subStr = data.split(delimeter);
            names.add(subStr[i+1]);
            i++;

        }
        for (String s : names) {
            System.out.println(s);
        }
        return names;


    }



}
