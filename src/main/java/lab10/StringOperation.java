package lab10;

import java.util.stream.IntStream;

public class StringOperation {
    public static void main(String[] args) {
        String s = "start";
        StringBuilder b = new StringBuilder(s);

        for(int i = 0; i < 10; i ++)
            b.append("$");

        System.out.println(b.toString());
    }

}
