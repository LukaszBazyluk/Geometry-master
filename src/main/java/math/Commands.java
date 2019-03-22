package math;

import java.util.Arrays;
import java.util.Collections;

public class Commands{

    public String getHelpCommand() {
        return "Write command :\n " + "triangle - to get triangle info\n"
                + "rectangle - to get rectangle info";
    }
    public String getRectangleCommand(){
        return "diagonal - to get rectangle diagonal..\n" +
                        "field - to get rectangle field..";
    }
}